SUMMARY = "omniORB libraries"
DESCRIPTION = "Shared libraries providing the omniORB CORBA implementation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libomniORB4-3-4.3.0-2.8.aarch64.rpm"
RPM_HASH = "487b022a2755cdd1ab0b8fd60746f5168a330ed03778fa9da281e694c000b3928b6619b1dc8b0d3902b657e7b637386a344e74b764266f0fd8cb3945c9ca2cde"

RPROVIDES:${PN} += "libCOS4.so.3 \
libCOSDynamic4.so.3 \
libomniCodeSets4.so.3 \
libomniConnectionMgmt4.so.3 \
libomniDynamic4.so.3 \
libomniORB4-3 \
libomniORB4.so.3 \
libomniZIOP4.so.3 \
libomniZIOPDynamic4.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomnithread.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
