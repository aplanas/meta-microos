SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libubsan1-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "8c69e0c44d14542ff65585d5979c5fa1512950acc93cfb2f31ef97ab970680eff6ffa025706b1d28b92a1a2e9814c94a40820eb8c096a7480d167c992bad2868"

RPROVIDES:${PN} += "libubsan.so.1()(64bit) \
libubsan1 \
libubsan1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
