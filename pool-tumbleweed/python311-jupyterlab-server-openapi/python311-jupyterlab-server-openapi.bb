SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-openapi-2.23.0-1.4.noarch.rpm"
RPM_HASH = "dc5e5da24696583bd3470bc6500f2f809e7e10d371f73778e5605ccf3e9a56529374a6eb627543e19f4d6fb3c2d13e7410665b9a1e50a05654feb9cc882f3f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-openapi \
python311-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python311-openapi-core >= 0.16.1 with python311-openapi-core < 0.17 \
python311-jupyterlab-server \
python311-ruamel.yaml"

inherit rpm
