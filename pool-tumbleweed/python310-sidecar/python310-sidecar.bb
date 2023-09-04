SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python310-sidecar-0.5.2-6.1.noarch.rpm"
RPM_HASH = "47e29ed81c28ed04eb6e9834a476fd96cdfb2f6a0f6b0e4a49b081e4676d76d029c4c52123722c4da120f06abed0f7b6761fc5784e8bb61bdeca21dbcbf867d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sidecar \
python310-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi \
python310-jupyterlab"

inherit rpm
