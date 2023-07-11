SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "libpng-2.0"

PV = "1.6.40"

RPM_NAME = "libpng16-16-1.6.40-1.1.aarch64.rpm"
RPM_HASH = "8fea31ca6b4f1e8652fb0851334b20b438a81482305af3c274fe528ab40d59d0d27709c17d7ff208529b3aaa3f4429827eb948fb9b98e18c975401c7ad0d1947"

RPROVIDES:${PN} += "libpng \
libpng16-16 \
libpng16.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
