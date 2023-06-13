SUMMARY = "Main functionality library of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "libaudcore5-4.3-1.3.aarch64.rpm"
RPM_HASH = "d3128bbec7dbeed633a45a98a6edea239abbbfc277daad0eb3f28b485d868234a345e7e9352b2f8b049b095dfd95e675248caa522a28b6d88417e69375647f31"

RPROVIDES:${PN} += "libaudcore(aarch-64) \
libaudcore.so.5()(64bit) \
libaudcore5 \
libaudcore5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
