SUMMARY = "A Python XML Interface"
DESCRIPTION = "The expat module is a Python interface to the expat XML parser. Since \
Python2.x, it is part of the core Python distribution."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-xml-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "e5ebdf3d5aac859a37f609ffffce2bcbe85ac662d70325aed6352ef93bdd0dda86f09faef64b3e221088d61f8b5de8e2a33cc2d2abcc876325ad0110c9c40e8a"

RPROVIDES:${PN} += "python-xml \
python2-xml \
pyxml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython2.7.so.1.0 \
python-abi \
python-base"

inherit rpm
