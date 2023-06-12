SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-test-2.22.1-1.2.noarch.rpm"
RPM_HASH = "1fe33024e87a01e4488071e5c205f608608e08b65ccc5387ea700851309fde32f5c0d0c74798ed4a24fac59cd95b14ab43802d3ab8f4407aed59d04404605bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-server-test"
RDEPENDS:${PN} += "(python39-openapi-spec-validator >= 0.5.1 with python39-openapi-spec-validator < 0.6) \
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
