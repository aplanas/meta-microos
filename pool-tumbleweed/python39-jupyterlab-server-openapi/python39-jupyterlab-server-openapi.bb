SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python39-jupyterlab-server-openapi-2.23.0-1.4.noarch.rpm"
RPM_HASH = "f0c8e802688c58e8f47ecb406da59a5c330e83c28b95fabf69ffb029e31976797375226138eb3e669d918d02b19a546f705757ad59a10401fdf04dbdce431a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python39-openapi-core >= 0.16.1 with python39-openapi-core < 0.17 \
python39-jupyterlab-server \
python39-ruamel.yaml"

inherit rpm
