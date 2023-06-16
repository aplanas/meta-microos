SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.32.5"

RPM_NAME = "libneon-devel-0.32.5-1.4.aarch64.rpm"
RPM_HASH = "742d3370912ee2a45523009849d3524853a184e5fd6617ce07a0c220277831c813bdea5dc4152518c420ce6ad3de1b27f98c64e002b4603d6e9e8af73b84da69"

RPROVIDES:${PN} += "libneon-devel \
neon-devel \
pkgconfig-neon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libneon27"

inherit rpm
