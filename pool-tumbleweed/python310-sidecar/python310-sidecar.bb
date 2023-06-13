SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python310-sidecar-0.5.2-5.4.noarch.rpm"
RPM_HASH = "41fe283b61d39eac2d1325fab742df566f7eb7dfbb44ef63324ad1ca680bde803bd1961f37591323c45cafccab0ab16fefbad5b2ccce10f81a5fca6379e904c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidecar \
python3.10dist(sidecar) \
python310-sidecar \
python3dist(sidecar)"

RDEPENDS:${PN} += "(python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9) \
jupyter-sidecar-jupyterlab \
python(abi) \
python310-jupyterlab"

inherit rpm
