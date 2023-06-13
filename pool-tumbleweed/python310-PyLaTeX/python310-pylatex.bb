SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-PyLaTeX-1.4.1-2.11.noarch.rpm"
RPM_HASH = "bfda15b147f794d06423919c895ec5045358c6097036fc1bb29092fdad03066f59d8d3019592ef198c7ae6ac7882c2f160b36b1f62bbd7d3fef3b602a2b07898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyLaTeX \
python3.10dist(pylatex) \
python310-PyLaTeX \
python3dist(pylatex)"

RDEPENDS:${PN} += "python(abi) \
python310-ordered-set \
texlive-latex"

inherit rpm
