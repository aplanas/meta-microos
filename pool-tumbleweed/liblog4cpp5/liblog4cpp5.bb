SUMMARY = "Logging for C++"
DESCRIPTION = "Logging facilities providing library."
LICENSE = "LGPL-2.1-only"

PV = "1.1.3"

RPM_NAME = "liblog4cpp5-1.1.3-2.19.aarch64.rpm"
RPM_HASH = "5bfb7b7e0326b68ffdcc284e1f215195f436b787c2fdeddd257143a8885a97da2ceee0751015899af53732b9ec13db05b07bf803f9c27b7dfe24f7f4c22f033b"

RPROVIDES:${PN} += "liblog4cpp.so.5 \
liblog4cpp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
