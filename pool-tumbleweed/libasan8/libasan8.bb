SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libasan8-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "8ebdff48796f0aa2603cba72b9e077524cc82c1474f645611a541fa6e5086f02e3f1fbd3f5a01e260860f8cc793c8cb19c16855693ad2cc70546c38aa1b634f6"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
