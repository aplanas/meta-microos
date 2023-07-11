SUMMARY = "Bullet HACD Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libHACD3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "a068e418a2b63c855740687f52f4773ae967d017104e4a2309d666c88cc0149c6fb67909d9ef8948f3f50af0c28d5ce89f1201bcd64fbfa8e233bf3b4eeee4a9"

RPROVIDES:${PN} += "libHACD.so.3.17 \
libHACD3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
