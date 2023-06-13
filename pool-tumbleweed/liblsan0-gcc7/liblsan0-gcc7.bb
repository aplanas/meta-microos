SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "liblsan0-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "9fe235429fc5838c3ebfa7aad8b845ad6dad6c54a350b5277f08b8e967d9b4be0154cc668c6da592e3fa8d93b9724d86aedba3a410ee22049eb6369bbc1c8c55"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) \
liblsan0 \
liblsan0-gcc7 \
liblsan0-gcc7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
