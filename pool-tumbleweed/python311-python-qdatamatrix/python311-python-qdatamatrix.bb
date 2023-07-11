SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python311-python-qdatamatrix-0.1.31-1.9.noarch.rpm"
RPM_HASH = "2e947b6018e58630eb61b472e5c1fd36f0b9195b9bf23a7e178ff8869c5f50ca89cec6b77695063dd16362c0b7642c8a8c90afa6716a5587b0b341f35acc40aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qdatamatrix \
python3.11dist-python-qdatamatrix \
python311-python-qdatamatrix \
python3dist-python-qdatamatrix"

RDEPENDS:${PN} += "python-abi \
python311-QtPy \
python311-python-datamatrix"

inherit rpm
