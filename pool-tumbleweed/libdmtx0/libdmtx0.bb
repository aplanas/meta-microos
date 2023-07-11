SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "libdmtx0-0.7.7-1.5.aarch64.rpm"
RPM_HASH = "0eb4ca45327d85ef51e67a495cf3ca83133c88824bdced9b5c358deabb5e5f1b3962474f5bbf5638dd07e49269b91c6c29aeb4f8e665b98fe4395cd435dbf9fd"

RPROVIDES:${PN} += "libdmtx.so.0 \
libdmtx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
