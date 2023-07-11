SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "liblsan0-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "8bb8d7c411d68a85ab0d0826711689792c3d274e92d2ee939dabe25c28288a31a0dd89aaea841147f386fced316ca3d87393d91a3d58bfc963f001e607ae0899"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
