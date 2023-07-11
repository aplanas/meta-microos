SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python310-rich-13.4.1-1.3.noarch.rpm"
RPM_HASH = "054c00fa7872e3429c288c4d2a7d77524f6520a3d2b99e32bbe08e7bfa6d1006ba44eeef29d7b1c0ede1637500cabbce228d48c0aa07ad059d4ce698fdeb9831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rich \
python310-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python310-markdown-it-py \
python310-pygments"

inherit rpm
