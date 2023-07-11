SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-test-2.23.0-1.3.noarch.rpm"
RPM_HASH = "30ba5fe816d29ad7373b575936eebbc05616bab2ea56e314907fea88d3757bf4df30cb6f4af8529ac1014677891e0dd7da87a06fdb4702dc42fa3256e9cc849a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-test \
python311-jupyterlab-server-test"

RDEPENDS:${PN} += "-python311-openapi-spec-validator >= 0.5.1 with python311-openapi-spec-validator < 0.6 \
python311-Werkzeug \
python311-ipykernel \
python311-jupyterlab-server-openapi \
python311-pytest \
python311-pytest-console-scripts \
python311-pytest-jupyter-server \
python311-pytest-timeout \
python311-requests-mock \
python311-strict-rfc3339"

inherit rpm
