SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python311-jupyterlab-server-test-2.24.0-1.1.noarch.rpm"
RPM_HASH = "8d84c8928403245f727efe5a2928ddb60c55a0b85a2911c558c109cbef424efff1ddbf14e7b4a6b9d74022915dfa507708ee2ddc2534aa8c9dd64fc90e957954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-server-test \
python311-jupyterlab-server-test"

RDEPENDS:${PN} += "-python311-openapi-spec-validator >= 0.5.1 with python311-openapi-spec-validator < 0.7 \
python311-Werkzeug \
python311-ipykernel \
python311-jupyterlab-server \
python311-pytest \
python311-pytest-console-scripts \
python311-pytest-jupyter-server \
python311-pytest-timeout \
python311-requests-mock \
python311-strict-rfc3339"

inherit rpm
