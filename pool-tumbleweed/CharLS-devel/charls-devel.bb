SUMMARY = "Libraries and headers for CharLS"
DESCRIPTION = "This package contains libraries and headers for CharLS."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "CharLS-devel-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "9dda8d56bbdcb5709b39bc0fd6aa5065bcdd053b3dc94e261b9f2adbede93619790fd3d79c0e3aa682bc7c9662554fc9e3916d7996c95060120e54136f9fb87e"

RPROVIDES:${PN} += "CharLS-devel \
cmake-charls \
pkgconfig-charls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcharls2"

inherit rpm
