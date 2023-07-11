SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python39-python-qdatamatrix-0.1.31-1.9.noarch.rpm"
RPM_HASH = "69412ed4cf1cca92ca839a561be31c0fa4bb0fb35e1618fabd2ea32ea3436d3041830bc0f2a0c69fc68b344ee43c6b78389ce902662b07bc75b03c8de8dccb3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-qdatamatrix \
python39-python-qdatamatrix \
python3dist-python-qdatamatrix"

RDEPENDS:${PN} += "python-abi \
python39-QtPy \
python39-python-datamatrix"

inherit rpm
