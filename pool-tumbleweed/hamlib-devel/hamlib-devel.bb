SUMMARY = "Development files for hamlib, a set of radio control libraries"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-devel-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "db2093c3488e8042ae9384c1f56a288fb133e870d829888a918279a8e8b39553a84114fdebebb49aa4e2bcb95f0b76655e8ea0d380735ff704cddc447dafaf54"

RPROVIDES:${PN} += "hamlib-devel \
pkgconfig-hamlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhamlib++4 \
libhamlib4 \
pkgconfig-libusb-1.0"

inherit rpm
