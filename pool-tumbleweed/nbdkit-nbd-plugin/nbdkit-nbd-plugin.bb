SUMMARY = "NBD proxy / forward plugin for nbdkit"
DESCRIPTION = "This package lets you forward NBD connections from nbdkit \
to another NBD server."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-nbd-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "e4fa39f5f3cae92954111160c13feadbe22929db90b4bd98f848e51fd9d309903b5be0f977848bcbda281f2676225faccb08ed4d910d4b941a0f78a20debbc52"

RPROVIDES:${PN} += "nbdkit-nbd-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
nbdkit-server"

inherit rpm
