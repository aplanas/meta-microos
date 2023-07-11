SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-openapi-2.23.0-1.3.noarch.rpm"
RPM_HASH = "f300ad70acf263ac6e561c1c5773a4e60e67b2afc9fea3b22cfd1b39e7b412a71671d5c83d3f75e74f35b28d622021c7da90be1a223bf6ce09878ef450d2e2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-openapi \
python311-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python311-openapi-core >= 0.16.1 with python311-openapi-core < 0.17 \
python311-jupyterlab-server \
python311-ruamel.yaml"

inherit rpm
