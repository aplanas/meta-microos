SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "python39-jupyter-server-test-2.7.2-1.1.noarch.rpm"
RPM_HASH = "d94700257aef66eefcf045d1e04e3a40fec7dde1993b192646820b7c66f4da9554719968b1a8e928214df16f3dbd1f1882ce925ef5dc3898ca3bcfd6c5e5b4e5"
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
