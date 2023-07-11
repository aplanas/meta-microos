SUMMARY = "Development files for libnpupnp"
DESCRIPTION = "The libnpupnp-devel package contains libraries and header files for \
developing applications that use libnpupnp."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "libnpupnp-devel-5.0.0-1.5.aarch64.rpm"
RPM_HASH = "bfd0b2557b970c5c78d13ccf84ed1b718a944ea3bcf839a8133c58a930c04bb58526efc1ca9914778a614cae3cc589499fbdef50c8059fa771a7fe12934a9c99"

RPROVIDES:${PN} += "libnpupnp-devel \
pkgconfig-libnpupnp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnpupnp9"

inherit rpm
