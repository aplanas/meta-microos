SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libubsan1-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "b244b906dae4f3c688776a71886fbe07a250bf6cdb12957ca76048285b489968433fee7d9b77146524bc503bbe908ea1d02ed7f559f28f9c88dca3d58a665d8b"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
