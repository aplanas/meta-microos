SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-test-2.23.0-1.3.noarch.rpm"
RPM_HASH = "5ce75dee1118f8fafe3304b5389eb9d63a8ca8003def6638802976bd7bef7773da1c44c9b2032857c3f8154a59782d9612dedcf0068080a1ab8e378813ef0599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyterlab-server-test"

RDEPENDS:${PN} += "-python310-openapi-spec-validator >= 0.5.1 with python310-openapi-spec-validator < 0.6 \
python310-Werkzeug \
python310-ipykernel \
python310-jupyterlab-server-openapi \
python310-pytest \
python310-pytest-console-scripts \
python310-pytest-jupyter-server \
python310-pytest-timeout \
python310-requests-mock \
python310-strict-rfc3339"

inherit rpm
