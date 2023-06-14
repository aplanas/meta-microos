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

RPM_NAME = "python39-epubmerge-2.15.0-1.4.noarch.rpm"
RPM_HASH = "0f22e6b3441205c8316a6e0939fb7f3b6f0cb6c520affa79df37f4faa7b0f013134b643ffe3a701ffea7afa5482753323724ed03f97b7b31c51e962478e4483b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-epubmerge \
python39-epubmerge \
python3dist-epubmerge"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
