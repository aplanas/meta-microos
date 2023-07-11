SUMMARY = "Development for libcamera, a camera support library"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
This subpackage contains the header files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-devel-0.0.4-2.5.aarch64.rpm"
RPM_HASH = "d44b2c0dacb4d49e879fac86706ee10df5a22763dbe7d523493e2e7c88b29cb90667498dd2f9d5d6734534bc0066f5af834d0c7e48bebd09e44b7448b543eccd"

RPROVIDES:${PN} += "libcamera-devel \
pkgconfig-libcamera \
pkgconfig-libcamera-base"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcamera-base0-0-4 \
libcamera0-0-4 \
pkgconfig-libcamera-base"

inherit rpm
