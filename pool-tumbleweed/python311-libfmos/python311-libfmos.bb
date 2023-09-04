SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python311-libfmos-20230707-2.1.aarch64.rpm"
RPM_HASH = "dffa824e7d84ad0ee2552bb76f7e99e8c982d4b2ea9dafe6813cd080d3eb4f61050c3518723c3879dbb62cd22cc6a570f1af3cbbb282241740f5e1fe940fdc32"

RPROVIDES:${PN} += "python3-libfmos \
python311-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
