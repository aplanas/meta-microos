SUMMARY = "Documentation for python-pyqtgraph"
DESCRIPTION = "Documentation and help files for python-pyqtgraph"
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python-pyqtgraph-doc-0.12.4-1.2.noarch.rpm"
RPM_HASH = "6261bfc41b844019dab1be72500cc0162a01b0bfffdf09ae037f12cc271f25c36baeb5b9f9da459c39eec12634239bb8ad3f92d14efbd1f4f57f66cc4c0524f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqtgraph-doc \
python310-python-pyqtgraph \
python38-python-pyqtgraph \
python39-python-pyqtgraph"

RDEPENDS:${PN} += ""

inherit rpm
