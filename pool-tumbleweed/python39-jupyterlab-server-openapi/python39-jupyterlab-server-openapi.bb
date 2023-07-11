SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python39-jupyterlab-server-openapi-2.23.0-1.3.noarch.rpm"
RPM_HASH = "d6e8fb2865e847e209a6260a0d7e2afb308de00022b2690057477ea17835fc1937b97a3abf97c4132e82fb0bfa16efab09812ac51fb959fe6faa31ba88f1530d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python39-openapi-core >= 0.16.1 with python39-openapi-core < 0.17 \
python39-jupyterlab-server \
python39-ruamel.yaml"

inherit rpm
