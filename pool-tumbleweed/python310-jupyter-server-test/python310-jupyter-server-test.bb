SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-jupyter-server-test-2.6.0-1.3.noarch.rpm"
RPM_HASH = "252a92115db4c86df50b3ea88a0a0a6c37107664bd8f443ec916e7c4181564d8307e67a720861a0d73087fbb4b8f4ea632f1fdd74142b6ef84203c64950ddb3c"
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
