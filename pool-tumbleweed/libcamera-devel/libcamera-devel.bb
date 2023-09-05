SUMMARY = "Development for libcamera, a camera support library"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
This subpackage contains the header files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "libcamera-devel-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "b6fe3df9bc9b9473e439f2221c06a51bf2117d2015ae8ba41f05e287eb8148b7b223ee32fd7314722252be97e9a4af4d102d1d0b4de0c849ddd9675b0e8ec182"

RPROVIDES:${PN} += "libcamera-devel \
pkgconfig-libcamera \
pkgconfig-libcamera-base"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcamera-base0-1 \
libcamera0-1 \
pkgconfig-libcamera-base"

inherit rpm
