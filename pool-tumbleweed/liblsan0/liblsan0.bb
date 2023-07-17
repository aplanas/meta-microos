SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "liblsan0-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "13ae3f9c527646498ddc494b69e1df59af78a3a8efde8a5a7476e7be0b03f6817b06aace79a9d2666cca98f6ffe692ca4fa4ed2629666fc6cd7de6834601ac79"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
