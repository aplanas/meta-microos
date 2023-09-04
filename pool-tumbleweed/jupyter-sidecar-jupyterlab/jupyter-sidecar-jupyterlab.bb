SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "jupyter-sidecar-jupyterlab-0.6.2-6.1.noarch.rpm"
RPM_HASH = "513c7ef7f518bb5a316dfdb0d2f35072050e3fe2dacb4e8d4177a2d3c919f23bd1583aedca911e131bdc46af30937dd8549ecd0f8629e15cb396ab98162ea98e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-sidecar-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-sidecar"

inherit rpm
