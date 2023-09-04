SUMMARY = "Performance Co-Pilot (PCP) development headers"
DESCRIPTION = "Performance Co-Pilot (PCP) headers for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp-devel-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "526e571ddb555e52e1415c7c83a84d0a64ff44fed675b520fe2d0593a34331de8ee229ef7af154d0c1995864199d382854db37282a13595472eaf8536e692e6c"

RPROVIDES:${PN} += "libpcp-devel \
pcp-devel \
pkgconfig-libpcp \
pkgconfig-libpcp-import \
pkgconfig-libpcp-pmda"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcp-gui2 \
libpcp3"

inherit rpm
