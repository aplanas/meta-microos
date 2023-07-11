SUMMARY = "Network Block Device server"
DESCRIPTION = "This package contains the nbdkit server with no plugins or filters."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-server-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "6e5ff88c87d15378c8adcd4505a19767472dfe367dcce3ea1b65226e2a402543888dab7ab9678d67cf5d5a6e35cedb7690e270a49edf57ea2971c6570ba24678"

RPROVIDES:${PN} += "nbdkit-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libselinux.so.1"

inherit rpm
