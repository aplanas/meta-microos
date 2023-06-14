SUMMARY = "Main functionality library of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "libaudcore5-4.3-1.3.aarch64.rpm"
RPM_HASH = "d3128bbec7dbeed633a45a98a6edea239abbbfc277daad0eb3f28b485d868234a345e7e9352b2f8b049b095dfd95e675248caa522a28b6d88417e69375647f31"

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
