SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-sidecar-0.5.2-6.1.noarch.rpm"
RPM_HASH = "c25beb3d383074887a9875304f59ffcc471bf44a3beac623997e76ae328481ac91f8e804095a8bc66717ac6c659694354ac18f5d0e24e51504902861d2f0a808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sidecar \
python39-sidecar \
python3dist-sidecar"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9 \
jupyter-sidecar-jupyterlab \
python-abi \
python39-jupyterlab"

inherit rpm
