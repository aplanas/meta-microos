SUMMARY = "Python 3 bindings for newt"
DESCRIPTION = "The python3-newt package contains the Python 3 bindings for the newt library \
providing a python API for creating text mode interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "python3-newt-0.52.23-2.1.aarch64.rpm"
RPM_HASH = "da4c3c0e5e2d934b7d378489d3212edbdbf706e87d4ccec7afca9f4e64405564c1a3abf791de19bdcb3460eca823a3b97fcdec8395f7b2cecfb0fd8b446522da"

RPROVIDES:${PN} += "python3-newt \
python3-newt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnewt.so.0.52()(64bit) \
newt \
python(abi)"

inherit rpm
