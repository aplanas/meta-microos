SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-jupyter-server-test-2.6.0-1.5.noarch.rpm"
RPM_HASH = "534e6fe31ad99dae38ac04cc4ab5e020d7b408ce04d6007d44c3fba585b964f35a9cdf51bbb733ea6bfda16ff6e7e549147e403fd9260a7dc50c06fee420957c"
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
