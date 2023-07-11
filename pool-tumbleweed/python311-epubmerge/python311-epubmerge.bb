SUMMARY = "EpubMerge Calibre Plugin"
DESCRIPTION = "This plugin provides the ability to create new EPUBs by combining the contents \
of existing (non-DRM) EPUB format eBooks. \
 \
Main Features of EpubMerge Plugin: \
    - Select a list of stories in calibre, \
    - Order them, \
    - Edit the metadata for the new combined eBook, and then, \
    - Merge the contents of the EPUBs together into the new eBook, now \
      including cover from metadata if set. \
    - UnMerge previously merged epubs if metadata was saved during merge. \
    - Configurably able to save the metadata for each merged book for UnMerging \
      later if desired. (Defaults to On.) \
    - Configurably able to populate custom columns from source books. \
    - Options now stored inside the Library rather than an external JSON file. \
    - CLI \
 \
There are a few configurable options: whether or not to insert a Table of \
Contents entry for each merged book (with it's original TOC nested underneath \
it), an option to flatten the TOC down to one level only, and including the \
merged books comments. These options are stored by Library."
LICENSE = "GPL-3.0-only"

PV = "2.15.0"

RPM_NAME = "python311-epubmerge-2.15.0-1.5.noarch.rpm"
RPM_HASH = "3a5e8c680a06415fc59047283831c0c0748a3a3c1368af3be99862dfe268e3353a81ef7b34a7a3fe3734476edd3f283de2fb7dd06070bec892e5332fbe4e4865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-epubmerge \
python3.11dist-epubmerge \
python311-epubmerge \
python3dist-epubmerge"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
