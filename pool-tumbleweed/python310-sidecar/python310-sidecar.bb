SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python310-sidecar-0.5.2-5.5.noarch.rpm"
RPM_HASH = "f40126fdd945eeb4bd57efcdd35986ebbf18898bcd3f88ffff0a2edcfbe0842a2cdeb29c7a15c1e2da2fe773ccbbbf9f3751b4dceb47fb0b33e9c01029d225de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sidecar \
python310-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi \
python310-jupyterlab"

inherit rpm
