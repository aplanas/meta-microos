SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-PyLaTeX-1.4.1-2.13.noarch.rpm"
RPM_HASH = "b08dbad3065793935c2bfd9288045f59e946fe58e66e4b431d51ca6e1d5766c002dbb72e25ed2e182d1cbfba08573ec4cd05698e122080a225b99521aaf1de0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylatex \
python310-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python310-ordered-set \
texlive-latex"

inherit rpm
