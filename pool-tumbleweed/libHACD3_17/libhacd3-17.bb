SUMMARY = "Bullet HACD Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libHACD3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "979c52484e47b216bdd1c03e1183411903869a62abe539abcbc30bccc27b7cc54bd43c8d50c2684c047728b9d83fd610d146340e67d9a1c6ac9cf9d36c2c3958"

RPROVIDES:${PN} += "libHACD.so.3.17()(64bit) \
libHACD3_17 \
libHACD3_17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
