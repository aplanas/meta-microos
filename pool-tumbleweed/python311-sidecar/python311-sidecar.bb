SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python311-sidecar-0.5.2-5.4.noarch.rpm"
RPM_HASH = "1a6d901ef0c41354d0c4fc036ed4ca6a4766303afabe8e0691ca2abb16b3fe969c056c99bf3953b7e274a88440cac020e5d921454059e3de86e6946e5d437b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sidecar) \
python311-sidecar \
python3dist(sidecar)"

RDEPENDS:${PN} += "(python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9) \
jupyter-sidecar-jupyterlab \
python(abi) \
python311-jupyterlab"

inherit rpm
