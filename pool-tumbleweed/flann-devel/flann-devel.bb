SUMMARY = "Development files for flann"
DESCRIPTION = "Fast Library for Approximate Nearest Neighbors. \
 \
This package contains the header files and libraries needed to develop \
application that use flann."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "flann-devel-1.9.2-3.4.aarch64.rpm"
RPM_HASH = "3dd9f8b20a2953aa80bca5e51916062250cfd4177d89f920bf325a97b413704880cbbe4a0ab5cd9a8550953ba3367132e7b3a752cfa3e2d2462e7b134938cee2"

RPROVIDES:${PN} += "cmake-flann \
flann-devel \
pkgconfig-flann"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflann1-9 \
liblz4-devel"

inherit rpm
