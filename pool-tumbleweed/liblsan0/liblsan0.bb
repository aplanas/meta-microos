SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "liblsan0-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "f0232fe4314122c6a49818c0653b15254ab2bf990d2cb2bdefdaff0d1eee4c058926d2980e6d8aece3ee2c7bd66980f3543abaea0da0104b215d7a67d8b63226"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
