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

RPM_NAME = "python310-Pweave-0.30.3-6.4.noarch.rpm"
RPM_HASH = "4383e2c7f7f3c9c8084ad9a0e24b6aa4ed2b96f2aec2751799c36b18f283da8e39c123bb5413d26bcc6ed1a376b3af69390226a3de17ab85fb59fa95dc2a8538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pweave \
python3.10dist(pweave) \
python310-Pweave \
python3dist(pweave)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Markdown \
python310-Pygments \
python310-certifi \
python310-jupyter_client \
python310-jupyter_ipykernel \
python310-jupyter_ipython \
python310-jupyter_nbconvert \
python310-jupyter_nbformat"

inherit rpm
