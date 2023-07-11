SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python310-python-qdatamatrix-0.1.31-1.9.noarch.rpm"
RPM_HASH = "d9ba30ca5584fd66283e6769e421dbe3e12f08c2a829e9de65a4862098b7578e9d211840c18a4bd7a2ef524f9715df5dbf60609e3ace0c34511581d933358ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-qdatamatrix \
python310-python-qdatamatrix \
python3dist-python-qdatamatrix"

RDEPENDS:${PN} += "python-abi \
python310-QtPy \
python310-python-datamatrix"

inherit rpm
