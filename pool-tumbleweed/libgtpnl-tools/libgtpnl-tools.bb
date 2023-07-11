SUMMARY = "GTP tunnel configuration utilities"
DESCRIPTION = "Utilities to configure GTP tunnels."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.4"

RPM_NAME = "libgtpnl-tools-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "2bdf3946e8ead21961766ef59d51672f07f627f3f4c91104945006a6fc388bfc0c7c7cd3b3fb580af3074a38cac9509622db6a64a191a7e1d592ecca208dcbaf"

RPROVIDES:${PN} += "libgtpnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgtpnl.so.0 \
libmnl.so.0"

inherit rpm
