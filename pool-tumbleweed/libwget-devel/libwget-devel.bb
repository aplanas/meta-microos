SUMMARY = "Development files for libwget"
DESCRIPTION = "libwget which provides an interface to many useful functions used by \
Wget2. \
 \
This subpackage contains the header files for application wanting \
to build against libwget."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libwget-devel-2.0.1-1.6.aarch64.rpm"
RPM_HASH = "658ab6f46e0f46d9a58536364747ab711721c807bdf294a26896eeb3a8da0b0c0d1629d94d47d62b4d9d15f927015a8beac5018c984a697d36285e8b69a0464a"

RPROVIDES:${PN} += "libwget-devel \
pkgconfig-libwget"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
