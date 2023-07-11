SUMMARY = "Scientific reports with embedded python computations"
DESCRIPTION = "Pweave is a scientific report generator and a literate programming \
tool for Python. Pweave can capture the results and plots from data \
analysis and works well with NumPy, SciPy and matplotlib. It is able \
to run python code from source document and include the results and \
capture matplotlib plots in the output. \
 \
Pweave is good for creating reports, tutorials, presentations etc. \
with embedded python code It can also be used to make websites together \
with e.g. Sphinx or rest2web."
LICENSE = "BSD-3-Clause"

PV = "0.30.3"

RPM_NAME = "python310-Pweave-0.30.3-6.5.noarch.rpm"
RPM_HASH = "516a1a2aad9ab921ffa0c8e72ee7424890177d27e5c48ac40fe91d278b1e5315541e5465e8cad2cd8795ce889375f77bd2aecc5f6b5889b5ce1bbbd678e1ccee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pweave \
python310-Pweave \
python3dist-pweave"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Markdown \
python310-Pygments \
python310-certifi \
python310-jupyter-client \
python310-jupyter-ipykernel \
python310-jupyter-ipython \
python310-jupyter-nbconvert \
python310-jupyter-nbformat"

inherit rpm
