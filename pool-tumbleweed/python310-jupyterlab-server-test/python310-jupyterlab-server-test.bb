SUMMARY = "The jupyterlab_server[test] requirements"
DESCRIPTION = "Metapackage for the jupyterlab_server[test] requirement specifier \
without code coverage."
LICENSE = "BSD-3-Clause"

PV = "2.24.0"

RPM_NAME = "python310-jupyterlab-server-test-2.24.0-1.1.noarch.rpm"
RPM_HASH = "4fa653d4779eb8620514ea063d646e4fd4dc78973137515ba5cf7de588e882ae34061ab324b837d9c8fa3037e06a7f7852c72b1cfc440499ae29dd516c42cbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyterlab-server-test"

RDEPENDS:${PN} += "-python310-openapi-spec-validator >= 0.5.1 with python310-openapi-spec-validator < 0.7 \
python310-Werkzeug \
python310-ipykernel \
python310-jupyterlab-server \
python310-pytest \
python310-pytest-console-scripts \
python310-pytest-jupyter-server \
python310-pytest-timeout \
python310-requests-mock \
python310-strict-rfc3339"

inherit rpm
