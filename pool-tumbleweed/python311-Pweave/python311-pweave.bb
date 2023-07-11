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

RPM_NAME = "python311-Pweave-0.30.3-6.5.noarch.rpm"
RPM_HASH = "dbc60297f024650b9b3ddfb942dcf2302ec25d002c899724cf2f9ddd786b297b920191e79be47a238e1a206440c8c54e20ce6b4eaa3f0a8e290b181a8883f06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pweave \
python3.11dist-pweave \
python311-Pweave \
python3dist-pweave"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Markdown \
python311-Pygments \
python311-certifi \
python311-jupyter-client \
python311-jupyter-ipykernel \
python311-jupyter-ipython \
python311-jupyter-nbconvert \
python311-jupyter-nbformat"

inherit rpm
