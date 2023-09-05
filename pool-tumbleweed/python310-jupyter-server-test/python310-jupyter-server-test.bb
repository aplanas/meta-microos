SUMMARY = "The backend to Jupyter web applications - test requirements"
DESCRIPTION = "Metapackage for the jupyter_server[test] requirement specifier"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "python310-jupyter-server-test-2.7.2-1.1.noarch.rpm"
RPM_HASH = "a364d3b495dacf2754246c68e52ed79297a040f65ce463392c982be400b439862f91f2e3014722c63af9668d3c77a82a4a184fdf7ec1e7b956ca6abdbde78873"
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
