SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python39-jupyterlab-server-test-2.24.0-1.1.noarch.rpm"
RPM_HASH = "200d62e9978c88b02f9f0f9568d25cd43f6897afdbf0ab605deafae0e1e50b4a0c14d8416e6813df2308ff8f69e7c45a1c3a3a16c96926e2341bb0e626a6c604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-test"

RDEPENDS:${PN} += "-python39-openapi-spec-validator >= 0.5.1 with python39-openapi-spec-validator < 0.7 \
python39-Werkzeug \
python39-ipykernel \
python39-jupyterlab-server \
python39-pytest \
python39-pytest-console-scripts \
python39-pytest-jupyter-server \
python39-pytest-timeout \
python39-requests-mock \
python39-strict-rfc3339"

inherit rpm
