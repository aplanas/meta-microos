SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-sidecar-0.5.2-5.5.noarch.rpm"
RPM_HASH = "1de9b4ae5fe20fc5ff573143ed1b852422ddeefb8fd960caa8be368800bdabeee69cad7be1d6b42f5a6923b1aff9a5882dd8f717e44190d6ea7a505161634342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sidecar \
python39-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi \
python39-jupyterlab"

inherit rpm
