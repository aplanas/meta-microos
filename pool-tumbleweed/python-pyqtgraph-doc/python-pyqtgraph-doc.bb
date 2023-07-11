SUMMARY = "Documentation for python-pyqtgraph"
DESCRIPTION = "Documentation and help files for python-pyqtgraph"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python-pyqtgraph-doc-0.13.3-1.1.noarch.rpm"
RPM_HASH = "69ec877d290c55f3841b487488ccf3f2ec9557eaa6a9e9d3f3f46378e61b9aef6d94ee94ea4184fc8a6b36fbab63d5ca477db331ecf356ba0764cccf63da910a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqtgraph-doc \
python310-python-pyqtgraph \
python311-python-pyqtgraph \
python39-python-pyqtgraph"

RDEPENDS:${PN} += ""

inherit rpm
