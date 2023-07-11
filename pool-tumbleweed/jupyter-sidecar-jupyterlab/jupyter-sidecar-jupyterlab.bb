SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "jupyter-sidecar-jupyterlab-0.6.2-5.5.noarch.rpm"
RPM_HASH = "04a48dc2b24dafbfb085fad52a95e4b69d4b85ceff96349fe5ae36e06d35d21b6adfc71f4ed7f04fa2d7f9a7a16fc2efd8c94a508d7d835765f549b92486cae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-sidecar-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-sidecar"

inherit rpm
