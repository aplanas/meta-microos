SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-openapi-2.23.0-1.3.noarch.rpm"
RPM_HASH = "4f3c7c4751f6ead29f4ff00169479a1154826f54285852b3ec2d07c247a6f2e58cfc778f3f78e275fe2ad6365bfb2b0ec87f6f91fc67275bba75eadb24578fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python310-openapi-core >= 0.16.1 with python310-openapi-core < 0.17 \
python310-jupyterlab-server \
python310-ruamel.yaml"

inherit rpm
