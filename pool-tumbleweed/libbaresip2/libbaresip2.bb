SUMMARY = "Standard library for baresip"
DESCRIPTION = "This package contains the shared library needed to run programs compiled with \
baresip"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libbaresip2-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "57234c836f757ea2e43dfc47f8ead82b6586fde937d4e0a9b20d7425cbc496e524bba11e233cf447cf76b184a78944678fc3771cb0b111d0d472983b3337da4a"

RPROVIDES:${PN} += "baresip \
libbaresip.so.2 \
libbaresip2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libre.so.12 \
librem.so.4"

inherit rpm
