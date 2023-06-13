SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "jupyter-sidecar-jupyterlab-0.6.2-5.4.noarch.rpm"
RPM_HASH = "29d5f1f84fb740ddf43b9582749f4e4a2b629dd515cabd986b5b5730284269140c70d0363d30bfc568d1916e27745df42835730587e74006931daa07fb782572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-sidecar-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist(sidecar)"

inherit rpm
