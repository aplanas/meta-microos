SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libtsan2-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "741f3d6c527377368f1da3d8606954b5e1e787e9db735de9ff7e5293a03c3d92753dc77fe0308d51b2f6907d1ef7cd723413374b0f0cc94113d374d34b1d6e2e"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
