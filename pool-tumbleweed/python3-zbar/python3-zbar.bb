SUMMARY = "Python3 module for ZBar"
DESCRIPTION = "This package contains the module to use ZBar from python3."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "python3-zbar-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "5ca6779b74ced993d005a8f54fc4e4bac5b59b0f239fb26da21e1f65faeca4abb9348b7e5c1c0e6b5721621ef2c940e33e6a87532bd498ca2c38b0a1633665be"

RPROVIDES:${PN} += "python3-zbar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzbar.so.0 \
python-abi"

inherit rpm
