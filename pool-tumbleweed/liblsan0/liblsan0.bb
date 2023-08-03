SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "liblsan0-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "7349e1ca9f95584c9d3fc45cd524b396d5fe8e2fbe8c6deeedddedc1fa64626ed3855edb7846f7f7eb7a599846c338bd6b972459c6412d42645064c07e99c4ca"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
