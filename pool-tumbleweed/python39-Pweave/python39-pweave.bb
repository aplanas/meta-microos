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

RPM_NAME = "python39-Pweave-0.30.3-6.5.noarch.rpm"
RPM_HASH = "97897388836d30e428b84b970dc32ff970d015510cf7c62eb12b533abb5f93098a12a2de967acfd0980f25b0f73ba041ab166d0a872b8511ae4086073bd03f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pweave \
python39-Pweave \
python3dist-pweave"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Markdown \
python39-Pygments \
python39-certifi \
python39-jupyter-client \
python39-jupyter-ipykernel \
python39-jupyter-ipython \
python39-jupyter-nbconvert \
python39-jupyter-nbformat"

inherit rpm
