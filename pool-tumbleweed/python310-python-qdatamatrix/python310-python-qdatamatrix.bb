SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python310-python-qdatamatrix-0.1.31-1.7.noarch.rpm"
RPM_HASH = "317e268f33aebcc965438b037914195db079a9d6488a4097378f964f32846fdde25d420cea4672fecd269242663b6c507e1c04c6b78ab236c46515c6253c8e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qdatamatrix \
python3.10dist(python-qdatamatrix) \
python310-python-qdatamatrix \
python3dist(python-qdatamatrix)"
RDEPENDS:${PN} += "python(abi) \
python310-QtPy \
python310-python-datamatrix"

inherit rpm
