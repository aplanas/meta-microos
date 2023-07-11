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

RPM_NAME = "epy-2022.12.11+git.1675870044.c7a87f3-1.4.noarch.rpm"
RPM_HASH = "3b8e3042dd9007f18f315f94851babbf4e9cc30b3acb062ccbc9b13a85131792e70e5e472e2b11849ffcbe9d43341a0c0bdd305de21491d73dc31c76b12e9df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epy \
python3.11dist-epy-reader \
python3dist-epy-reader"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-curses \
python3-mobi"

inherit rpm
