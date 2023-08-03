SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-jupyter-server-test-2.6.0-1.5.noarch.rpm"
RPM_HASH = "0ecfdbef818108022951eda101a4d5115bdfee6318b592cf06d6b12b8562d314375e05dc19aad694af07751e00afe1dd2e295f172c1e0d9d99a37cea66e8244b"
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
