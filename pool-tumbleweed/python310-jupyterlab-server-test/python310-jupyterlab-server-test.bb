SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python310-jupyterlab-server-test-2.23.0-1.4.noarch.rpm"
RPM_HASH = "278d189d6527acbc7179a2fb61b8eeacece895b47481d5ee7380bce00ffaeeccc44afe5f382a55abed3af273d3eb5f6fa1ec132df7dd1b4013c7a84dbb988896"
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
