SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python311-sidecar-0.5.2-5.5.noarch.rpm"
RPM_HASH = "226d33af4969b2ae2893eeaa9cdd418c3070bb21f9e3de40ef295196fbdd692418905c89bbfc3fb5d1f5ffb411b096ea1fddedebd9a01f9bba484103148fc3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidecar \
python3.11dist-sidecar \
python311-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi \
python311-jupyterlab"

inherit rpm
