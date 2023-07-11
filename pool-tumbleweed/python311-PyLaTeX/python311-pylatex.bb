SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-PyLaTeX-1.4.1-2.13.noarch.rpm"
RPM_HASH = "9cabfd5ed0cab7794ba13cc26892b8a930c439debf7b012973de5687800388c7940627903367861c1beb4229326f4bdcaaaec839c4fb16d1a2cb398962b3a928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyLaTeX \
python3.11dist-pylatex \
python311-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python311-ordered-set \
texlive-latex"

inherit rpm
