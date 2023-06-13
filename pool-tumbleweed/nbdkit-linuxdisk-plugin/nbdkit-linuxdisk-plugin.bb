SUMMARY = "Virtual Linux disk plugin for nbdkit"
DESCRIPTION = "This package is a virtual Linux disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-linuxdisk-plugin-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "953432bd579c2fb3aa5f56053134c21cab2e0ebb8994cf401eb6679fe995833309df6f728e48013310b26efc39171c5e6c3f12b8ad72c30c9e436db16bf964c1"

RPROVIDES:${PN} += "nbdkit-linuxdisk-plugin \
nbdkit-linuxdisk-plugin(aarch-64)"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
nbdkit-server"

inherit rpm
