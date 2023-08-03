SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-jupyter-server-test-2.6.0-1.5.noarch.rpm"
RPM_HASH = "c67499ef683d7c1110a62c039c9d2f0d51ae10d60804f25ab4c018d38b1b7b669ee3fac6c8c8781f5d4f0b69955ab6f47476393dd0d9fa63682256c71336c524"
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
