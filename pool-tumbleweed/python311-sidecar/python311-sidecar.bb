SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python311-sidecar-0.5.2-6.1.noarch.rpm"
RPM_HASH = "3a2d20ddf29412d192342457fc5335bbf55346b536ad2871f410ee2cb35afae764292e0d73cc52c7f5691f831427e6f8a54f7e9784353170b4f9ac62ae884a50"
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
