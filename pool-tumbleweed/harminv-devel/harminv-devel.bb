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

PV = "1.4.2"

RPM_NAME = "harminv-devel-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "d0e936a8275534470366529f44c9b9ebd36586b1b8d44ef368011a8dd3b0112aa23dbfa6be7c4f2534e83aae31d0094b17902028ede1dc41ed2edeb6824d128b"

RPROVIDES:${PN} += "harminv-devel \
pkgconfig-harminv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharminv3"

inherit rpm
