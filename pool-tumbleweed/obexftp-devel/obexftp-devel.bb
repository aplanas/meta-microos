SUMMARY = "Development package for obexftp"
DESCRIPTION = "Files needed for software development using obexftp."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-devel-0.24.2-1.25.aarch64.rpm"
RPM_HASH = "c5392fae3223b464857ccaf910c79ddea7f83260088f88e58ef4e7d04c4e74a82d860a448ce3d3f6b77d41238abf90f25f33093f169e85b5ae1ab4cf1d00f533"

RPROVIDES:${PN} += "obexftp-devel \
pkgconfig-obexftp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
obexftp \
openobex-devel \
pkgconfig-bluez \
pkgconfig-openobex"

inherit rpm
