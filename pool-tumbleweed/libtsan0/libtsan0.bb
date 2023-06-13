SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libtsan0-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "eaa86176832a24f3c21859fe08c095f22e7449ab8df65de40a5cca4e6a7482eaad3d74c3952fd3f428d2b0a4c2ac345a7a9541c3fcaecc3903561cd3a3c46c2e"

RPROVIDES:${PN} += "libtsan.so.0()(64bit) \
libtsan0 \
libtsan0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
