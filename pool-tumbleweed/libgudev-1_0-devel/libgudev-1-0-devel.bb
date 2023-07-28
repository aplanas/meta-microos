SUMMARY = "Devel package for libgudev"
DESCRIPTION = "This is the devel package for the GObject library libgudev, which \
provides GObject access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "libgudev-1_0-devel-238-1.1.aarch64.rpm"
RPM_HASH = "7df384e4588ec8c0c9017aeed82c743c6b2fa0143b9312a82187f39d46e4fbd1f0f01281a532934b9b54e6e03c2574c9e33a65b05c2c902353c3dc4e933be35b"

RPROVIDES:${PN} += "libgudev-1-0-devel \
pkgconfig-gudev-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgudev-1-0-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libudev \
typelib-1-0-GUdev-1-0"

inherit rpm
