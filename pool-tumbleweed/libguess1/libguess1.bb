SUMMARY = "Shared library for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the shared libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess1-1.2-1.27.aarch64.rpm"
RPM_HASH = "0a458a30fbc609b313cfb50923121448c806634deca46efed0af3bfc3ce3f80a60d8499bddd4bac34db551c78f294263a43c101ec32d2ce8c052fa2d7d52ef57"

RPROVIDES:${PN} += "libguess.so.1 \
libguess1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
