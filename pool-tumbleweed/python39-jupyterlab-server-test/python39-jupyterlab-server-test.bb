SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.23.0"

RPM_NAME = "python39-jupyterlab-server-test-2.23.0-1.4.noarch.rpm"
RPM_HASH = "e9e94e04d5f3102b4bac754b2470aad7425f924461591d48068f29269ba690ea5db7ebd5c511d2b3df25982d0290c865a32e5d4596592bff1d65586bbda21470"
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
