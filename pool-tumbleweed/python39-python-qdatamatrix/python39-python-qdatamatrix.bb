SUMMARY = "A PyQt4/PyQt5 widget for viewing and editing a DataMatrix object"
DESCRIPTION = "The qdatamatrix package provides a graphical PyQt4/PyQt5 widget to \
view and edit a DataMatrix object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.31"

RPM_NAME = "python39-python-qdatamatrix-0.1.31-1.7.noarch.rpm"
RPM_HASH = "0dd2a194892152399be85bea8ec2d9daa0b72523ee2e605764a75938174089e8dc6adcf8df9fb8c3449ab2b7378e77a0a829eef9c8deccee7e4d3fd5188b2769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-qdatamatrix) \
python39-python-qdatamatrix \
python3dist(python-qdatamatrix)"
RDEPENDS:${PN} += "python(abi) \
python39-QtPy \
python39-python-datamatrix"

inherit rpm
