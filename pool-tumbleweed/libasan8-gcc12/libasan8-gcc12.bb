SUMMARY = "The GNU Compiler Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=address option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libasan8-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "069c8d746655b267e405056f95d79b959ffe1b5e16150df69173fbfe131be0b39aaed7a9d7752ec50d5bb4f69f5283a80789352b3c3088172bd36656ca03847f"

RPROVIDES:${PN} += "libasan.so.8 \
libasan8 \
libasan8-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
