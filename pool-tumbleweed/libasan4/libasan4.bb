SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libasan4-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "8839c5a0c72494c34c63f156ad0340c050b3b8676544cf7315d28c12053c3e2d54789d1a7fa931c219c70afc2a7e6d79639fdd11d8230154ddcbdf26144216b0"

RPROVIDES:${PN} += "libasan.so.4 \
libasan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
