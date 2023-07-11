SUMMARY = "Jupyter kernel for MATLAB"
DESCRIPTION = "A Jupyter kernel for MATLAB. \
 \
This kernel requires Jupyter with Python 3.5+, \
and the MATLAB engine for Python, which \
needs to be installed first."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "jupyter-imatlab-0.4-6.2.noarch.rpm"
RPM_HASH = "670241b153dfaa4d8e283eb37b0a056ab7e085243d0dd4d1ef89e3f699c0a56dca13482dd4f58c63d3970abbb07ba52a1ca6777f28c424034f0d5994d9d494d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-imatlab \
python3-imatlab \
python3-jupyter-imatlab-kernel \
python3.11dist-imatlab \
python3dist-imatlab"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-ipykernel \
python3-nbconvert \
python3-plotly \
python3-widgetsnbextension"

inherit rpm
