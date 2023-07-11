SUMMARY = "L2TP plugin for connman"
DESCRIPTION = "Provides L2TP (Layer 2 Tunneling Protocol) support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-l2tp-1.41-4.8.aarch64.rpm"
RPM_HASH = "d7bcd5506e1bb49b0acbe07bb172c1f594196a5559a1d511f2c2452419ba56aa98c48459c1d229ddda5356b7043bc4d475f71185a8fbb1a1cbf6388d8752186c"

RPROVIDES:${PN} += "connman-plugin-l2tp \
libppp-plugin.so"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
