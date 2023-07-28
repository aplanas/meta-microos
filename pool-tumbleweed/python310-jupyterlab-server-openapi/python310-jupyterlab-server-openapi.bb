SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-openapi-2.23.0-1.4.noarch.rpm"
RPM_HASH = "ae52e50e0ef2fa4d9eb90680ee8da55ed14d376f53d3408b6d8a49513274238becb5b2354a1c3183bd51009a1fbd529db389a62fd4cfc4a266e11b5f788cc9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python310-openapi-core >= 0.16.1 with python310-openapi-core < 0.17 \
python310-jupyterlab-server \
python310-ruamel.yaml"

inherit rpm
