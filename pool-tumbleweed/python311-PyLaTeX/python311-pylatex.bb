SUMMARY = "A Python library for creating LaTeX files and snippets"
DESCRIPTION = "PyLaTeX is a Python library for creating and compiling LaTeX files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-PyLaTeX-1.4.1-2.11.noarch.rpm"
RPM_HASH = "edaf1212c7445d1994e9cea1ad019d506ca3d05413d3bb0745e43eab7161f0b1287c8feef2c63387300f81812fdfa98fa4ae4a3ac8e1f3c956da7fa87a7c831e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pylatex \
python311-PyLaTeX \
python3dist-pylatex"

RDEPENDS:${PN} += "python-abi \
python311-ordered-set \
texlive-latex"

inherit rpm
