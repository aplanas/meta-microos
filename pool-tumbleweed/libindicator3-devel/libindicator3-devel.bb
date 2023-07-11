SUMMARY = "Development files for the Panel indicator applet"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator3-devel-16.10.0+bzr20171205-4.16.aarch64.rpm"
RPM_HASH = "ed67f71d3d7c7b686ec8d1ba5ed00cf5affcdd25a87c6684c9976681980bc4146e2fa7bd7427b268499fbc6b99f3bf4a2d30db77931dbef87b42155e7ab2aba5"

RPROVIDES:${PN} += "libindicator3-devel \
pkgconfig-indicator3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libido3-0.1.so.0 \
libindicator3-7 \
libindicator3.so.7 \
pkgconfig-gtk+-3.0"

inherit rpm
