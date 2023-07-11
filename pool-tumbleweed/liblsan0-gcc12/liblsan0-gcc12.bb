SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "liblsan0-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "245ed1fb349dfd4ec38ccaaf707d73ab00ce22c2c049eebc19ea566f3961f7cd78c47d7d7c6e380c1df46c773cd06e5f8e8625a17de066668bf029250e204a25"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
