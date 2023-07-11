SUMMARY = "Development Environment for libdvdnav"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "libdvdnav-devel-6.1.1-1.10.aarch64.rpm"
RPM_HASH = "db4fedf5a63ccf01bd74aca4655d9f8e39f01eb93fb124bc1b978ebfffa5edd52ea5662c74e5f56355ebc2783eb69d13033ba12e80f2e7c072a2208b370ace38"

RPROVIDES:${PN} += "libdvdnav-devel \
pkgconfig-dvdnav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvdnav4 \
pkgconfig-dvdread"

inherit rpm
