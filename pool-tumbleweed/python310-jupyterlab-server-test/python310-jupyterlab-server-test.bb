SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-test-2.22.1-1.2.noarch.rpm"
RPM_HASH = "9b833f92a58fcac361da88d1906cf6397a4441d94e625ceec6858a7d991e7d2d5891504273206e6350e548fa1c6894a9af168883d8468aec56df5c979602d041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-test \
python310-jupyterlab-server-test"
RDEPENDS:${PN} += "(python310-openapi-spec-validator >= 0.5.1 with python310-openapi-spec-validator < 0.6) \
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
