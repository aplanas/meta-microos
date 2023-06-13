SUMMARY = "Jupyter kernel for MATLAB"
DESCRIPTION = "A Jupyter kernel for MATLAB. \
 \
This kernel requires Jupyter with Python 3.5+, \
and the MATLAB engine for Python, which \
needs to be installed first."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "jupyter-imatlab-0.4-6.1.noarch.rpm"
RPM_HASH = "1374cc25f20e889327ca139cf22db3500135bfb8d447eaeb8aa47093adfad46fb47273f8f1b65a2afbe43e6dea846a00c5f9b3757d3565aef09d990a9b557e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-imatlab \
python3-imatlab \
python3-jupyter_imatlab_kernel \
python3.10dist(imatlab) \
python3dist(imatlab)"

RDEPENDS:${PN} += "/bin/sh \
python(abi) \
python3-ipykernel \
python3-nbconvert \
python3-plotly \
python3-widgetsnbextension"

inherit rpm
