SUMMARY = "Libraries and header files for the harminv library"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids. \
 \
This package contains libraries and header files for developing \
applications that use harminv."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "harminv-devel-1.4.1-1.19.aarch64.rpm"
RPM_HASH = "a275115379c415d74668bd2544aae9d10369c39d4203662497ac42679981f8aaf3e5571ad22e5ee7b2d9ca7343d246d70722ef033281845e1a4c207971743a02"

RPROVIDES:${PN} += "harminv-devel \
pkgconfig-harminv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharminv3"

inherit rpm
