SUMMARY = "Framework for browsing and searching media content"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "libgrilo-0_3-0-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "86e789af384ddbf354b2f4fa6976ead66e3045dfd0fd04db63640edadc635da8c52edcf3b11ae0eb682c1afb3bc3798824e6b3c8d67f352ad7959adbbd69a37d"

RPROVIDES:${PN} += "grilo \
libgrilo-0.3.so.0()(64bit) \
libgrilo-0_3-0 \
libgrilo-0_3-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
