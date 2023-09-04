SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "liblsan0-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "7abac6213d184f55bc92c7de205e4a8dc0335bfbabf567aee03bbdce889837b250c3ad1004cdd3b15910c6e5367f9d23fdf75b7488f3676f632d8736e92902b2"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
