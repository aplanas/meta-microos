SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-PyLaTeX-1.4.1-2.13.noarch.rpm"
RPM_HASH = "a3f6c9fdb99a2af0dec238c11ab73f89170219a98a7f4accb4716bddb2c4c2e3d83718ed97afb109309d5b281a861ec759c574cbee459a663412318b47986cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylatex \
python39-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python39-ordered-set \
texlive-latex"

inherit rpm
