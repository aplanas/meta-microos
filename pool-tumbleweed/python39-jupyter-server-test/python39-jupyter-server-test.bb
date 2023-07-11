SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-jupyter-server-test-2.6.0-1.3.noarch.rpm"
RPM_HASH = "35602fb01fb1cdbc7d7d68634b379ab752bfb48ec0598da41251f6e7a2725cd1a4766d2dda0a436623158bfea937c693e75eaa776c1715f12b0aabef12c4b1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyter-server-test"

RDEPENDS:${PN} += "python39-ipykernel \
python39-jupyter-server \
python39-pytest \
python39-pytest-console-scripts \
python39-pytest-jupyter-server \
python39-pytest-timeout \
python39-requests"

inherit rpm
