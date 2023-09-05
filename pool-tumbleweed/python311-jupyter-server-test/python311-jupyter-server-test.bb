SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "python311-jupyter-server-test-2.7.2-1.1.noarch.rpm"
RPM_HASH = "2849d8072204cec1d28e489f61da82042c8c61b4f314a5499bc6dd510fbd4ebedffd611c90f204ee57e58f6a9e1991b6276d674bb4346c73b2f62337fc955430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-test \
python311-jupyter-server-test"

RDEPENDS:${PN} += "python311-ipykernel \
python311-jupyter-server \
python311-pytest \
python311-pytest-console-scripts \
python311-pytest-jupyter-server \
python311-pytest-timeout \
python311-requests"

inherit rpm
