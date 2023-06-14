SUMMARY = "Development files for the libcomps library"
DESCRIPTION = "This package provides the development files for libcomps."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps-devel-0.1.19-2.3.aarch64.rpm"
RPM_HASH = "b676ded7f7ff645cf3f3609843d08fd67d002635bb35c21ffbd9c86670e6d5089cf7f9aabe143ed61dc500ffaaaee7621508cb23e2c21e75d0ea9f206e3c231c"

RPROVIDES:${PN} += "libcomps-devel \
pkgconfig-libcomps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcomps0 \
pkgconfig \
pkgconfig-expat \
pkgconfig-libxml-2.0"

inherit rpm
