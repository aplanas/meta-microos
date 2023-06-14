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

RPM_NAME = "python310-epubmerge-2.15.0-1.4.noarch.rpm"
RPM_HASH = "ff0a06e9a75ae48cab39db32b864664d600fdc09828670644de86313d58f92e73dcbc65e0fe83168234333d5c931aa16aa93d378914ed4bd8cbcc09d08f403c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-epubmerge \
python3.10dist-epubmerge \
python310-epubmerge \
python3dist-epubmerge"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
