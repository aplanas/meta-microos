SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python39-jupyterlab-server-test-2.23.0-1.3.noarch.rpm"
RPM_HASH = "0598f04584713b3488758e659b2efe75781653372a7ef8eceabd27b382517e8d84675e36c1a95f5f1b3d0fc404572345834a783ce8b18a58d657da1f2d7de21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-test"

RDEPENDS:${PN} += "-python39-openapi-spec-validator >= 0.5.1 with python39-openapi-spec-validator < 0.6 \
python39-Werkzeug \
python39-ipykernel \
python39-jupyterlab-server-openapi \
python39-pytest \
python39-pytest-console-scripts \
python39-pytest-jupyter-server \
python39-pytest-timeout \
python39-requests-mock \
python39-strict-rfc3339"

inherit rpm
