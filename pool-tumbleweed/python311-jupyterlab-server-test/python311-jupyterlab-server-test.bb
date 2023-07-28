SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python311-jupyterlab-server-test-2.23.0-1.4.noarch.rpm"
RPM_HASH = "15766b45d37a4ed20cf2622451a585f56a5865e99e259ffacccaf498b8f142bec199ffe089146e179838ccf78cb0e1d1b6734edc7b97de533dbd0d75c06a9e65"
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
