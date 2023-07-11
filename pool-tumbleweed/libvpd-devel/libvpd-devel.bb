SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd-devel package contains development libraries and header \
files that are used to access a vpd database created by vpdupdate in \
the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-devel-2.2.9-3.4.aarch64.rpm"
RPM_HASH = "fbd1aa215b10b946038abb7bf79c02c9817ac7faae5ccd7c5bcfa56a0dbcde428582590c335ba019b4a7cfaa71788f97fea511e1f53b15ce615a2e86f531b13a"

RPROVIDES:${PN} += "libvpd-devel \
pkgconfig-libvpd-2 \
pkgconfig-libvpd-cxx-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpd-2-2-3 \
pkgconfig-sqlite3"

inherit rpm
