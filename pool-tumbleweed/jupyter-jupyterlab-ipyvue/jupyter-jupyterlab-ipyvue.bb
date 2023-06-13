SUMMARY = "Jupyter widgets base for Vue libraries - labextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "jupyter-jupyterlab-ipyvue-1.9.1-1.1.noarch.rpm"
RPM_HASH = "f185880edc109f8ced3979aa5189c0240c408fb4f9e9772ac9ff5c3efa1884fe70fe8720706456b36e4cbc6fead27de025ba681f4629232ce9b37df7101579ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvue"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist(ipyvue)"

inherit rpm
