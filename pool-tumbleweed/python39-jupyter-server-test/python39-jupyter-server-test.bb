SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-jupyter-server-test-2.6.0-1.4.noarch.rpm"
RPM_HASH = "8e245eae87dd180d9e9b70ee2d92383420bc775c0b720dc0f3fc0e41b35f0642b03ed62f70e3298796742c82c3e908765119b7d6298b197bb97a02dbc4500711"
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
