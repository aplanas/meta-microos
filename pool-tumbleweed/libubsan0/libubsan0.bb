SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libubsan0-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "167de41f18af2fd8b541cc293aa340009f3ec197d1ca06b1c6b3d9abd9cc0337bc28392ddc3529c56ad49e62235cce8e2fa6ebb218ab34511c3488ecffe3d3db"

RPROVIDES:${PN} += "libubsan.so.0 \
libubsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
