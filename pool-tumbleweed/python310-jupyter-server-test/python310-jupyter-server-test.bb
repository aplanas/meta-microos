SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-jupyter-server-test-2.6.0-1.4.noarch.rpm"
RPM_HASH = "6f568c4bf468227680a0ee4fe7ec8c0b6a19aae30455170216ac7bf149b602e967dca0bed6240dd46e4a1854555cf9465466aedf88139eb1842d21c2410c4eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-server-test"

RDEPENDS:${PN} += "python310-ipykernel \
python310-jupyter-server \
python310-pytest \
python310-pytest-console-scripts \
python310-pytest-jupyter-server \
python310-pytest-timeout \
python310-requests"

inherit rpm
