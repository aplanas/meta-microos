SUMMARY = "Documentation for python-pyqtgraph"
DESCRIPTION = "Documentation and help files for python-pyqtgraph"
LICENSE = "MIT"

PV = "0.13.3"

RPM_NAME = "python-pyqtgraph-doc-0.13.3-2.1.noarch.rpm"
RPM_HASH = "3a94a453456b2c44b9512f840c05cb9c2643de77229f40c596bf96a4c0c43109af33be12da7d51d61c8efad9fb9c045407ec521260fbf0eb65539a64810744e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqtgraph-doc \
python310-python-pyqtgraph \
python311-python-pyqtgraph \
python39-python-pyqtgraph"

RDEPENDS:${PN} += ""

inherit rpm
