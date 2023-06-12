SUMMARY = "CLI ebook reader"
DESCRIPTION = "CLI Ebook reader. Fork of epr with these extra features: \
 \
    Supported formats: \
        Epub (.epub, .epub3) \
        FictionBook (.fb2) \
        Mobi (.mobi) \
        AZW3 (.azw3), some but not all \
 \
    Reading progress percentage \
    Bookmarks \
    External dictionary integration (sdcv or dict) \
    Inline formats: bold and italic (depend on terminal and font \
        capability. Italic only supported in python>=3.7) \
    Text-to-Speech (with additional setup) \
    Double Spread"
LICENSE = "GPL-3.0-only"

PV = "2022.12.11+git.1675870044.c7a87f3"

RPM_NAME = "epy-2022.12.11+git.1675870044.c7a87f3-1.3.noarch.rpm"
RPM_HASH = "2e10c834aab1396691fc2f9d662ce0d3ba1e0f797cdbfa5d6139cc694f76c66e9def5e686be66fae4604401a48d5306de540803dadaba866d4b77d85cd7ac1e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epy \
python3.10dist(epy-reader) \
python3dist(epy-reader)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-curses \
python3-mobi"

inherit rpm
