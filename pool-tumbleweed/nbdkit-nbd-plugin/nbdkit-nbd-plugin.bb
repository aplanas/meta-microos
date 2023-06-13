SUMMARY = "NBD proxy / forward plugin for nbdkit"
DESCRIPTION = "This package lets you forward NBD connections from nbdkit \
to another NBD server."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-nbd-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "5a2f36fefe8011da63be83e2b8ba651cb8212fb74a122a78c73c2ec045804704de6026abb9553247f22d050aea177087a4e268d544c767dd879c727613acb167"

RPROVIDES:${PN} += "nbdkit-nbd-plugin \
nbdkit-nbd-plugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnbd.so.0()(64bit) \
nbdkit-server"

inherit rpm
