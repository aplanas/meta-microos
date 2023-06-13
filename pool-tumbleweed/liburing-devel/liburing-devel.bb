SUMMARY = "Development files for Linux-native io_uring I/O access library"
DESCRIPTION = "This package provides header files to include and libraries to link with \
for the Linux-native io_uring."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.3"

RPM_NAME = "liburing-devel-2.3-3.1.aarch64.rpm"
RPM_HASH = "b7090ced264a955d5b64af86a45d11504c9ac658cd7d468337df0ad9ae326cc6efcc99694b77c1b1d24669c13663242409a4916161f45106b8ea24a81f92e21a"

RPROVIDES:${PN} += "liburing-devel \
liburing-devel(aarch-64) \
liburing2-devel \
pkgconfig(liburing)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liburing2 \
pkgconfig"

inherit rpm
