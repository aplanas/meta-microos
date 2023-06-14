SUMMARY = "The jupyterlab_server[openapi]] extra"
DESCRIPTION = "Metapackage for the jupyterlab_server[openapi] extra"
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-openapi-2.22.1-1.2.noarch.rpm"
RPM_HASH = "00ad9405cd2fec5c67e70936c2005624fc8e258c1a800f2c02752b6dfc6b10c7784ba0ca30b905d7466678a49f70ab6a419c6535e2a5aa2817889d819da51c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-openapi \
python310-jupyterlab-server-openapi"

RDEPENDS:${PN} += "-python310-openapi-core >= 0.16.1 with python310-openapi-core < 0.17 \
python310-jupyterlab-server \
python310-ruamel.yaml"

inherit rpm
