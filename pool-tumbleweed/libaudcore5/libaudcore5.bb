SUMMARY = "Main functionality library of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudcore5-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "d2abc943620940f8305f6723a79417ac0dbf52f75a189fe286f743aeb80ebf08a717aaf30fb94cf78af86e15d42874826bf92d8d677881b5d7a8d9969c46938c"

RPROVIDES:${PN} += "libaudcore \
libaudcore.so.5 \
libaudcore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
