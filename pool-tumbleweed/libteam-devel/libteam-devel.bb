SUMMARY = "Development files for libteam"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
This package contains the development headers for the libteam and \
libteamdctl libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.31"

RPM_NAME = "libteam-devel-1.31-4.1.aarch64.rpm"
RPM_HASH = "7bdfb767bb0536edba411faa59dfeb1fe08a2f7488be29af39d46632611f599692bf59b61a92a2c5d1989cc161f7917d695bdc0d15ad798a10d7659b2607d002"

RPROVIDES:${PN} += "libteam-devel \
pkgconfig-libteam \
pkgconfig-libteamdctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libteam5 \
libteamdctl0 \
pkgconfig-libnl-3.0"

inherit rpm
