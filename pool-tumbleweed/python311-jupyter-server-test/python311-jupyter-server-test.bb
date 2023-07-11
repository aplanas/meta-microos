SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-jupyter-server-test-2.6.0-1.3.noarch.rpm"
RPM_HASH = "ac599b1ad84cb2d6839bfec0d4731b9039298eb3a63ec8a6651139f99844a3192a4b3e3d21814298f7fc51c0f92a952dea2a70a069295fd9a6ebe9768e960feb"
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
