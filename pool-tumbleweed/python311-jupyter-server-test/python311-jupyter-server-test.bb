SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-jupyter-server-test-2.6.0-1.4.noarch.rpm"
RPM_HASH = "5f9bc4d1ee158134c8f6c32e77288afcd90404f2cb82acd3b57243fb8bb40e3e3078d1b2986fcc964e9e76373c6500fb0e6adfe8ee5a3aeedfb3acc4d17659ed"
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
