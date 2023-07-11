SUMMARY = "Header files for libdict"
DESCRIPTION = "Development and header files for libdict."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libdict-devel-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "41aa8ba8ecdc171835c68c0789e7d1885ee081d1347a019a6b0e95b8eec0c9bd370fdefb786f2974253b18b7c8001aae9ab3ec9d1de460f45ffdf549e419951d"

RPROVIDES:${PN} += "libdict-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdict.so.1.0 \
libdict1-0"

inherit rpm
