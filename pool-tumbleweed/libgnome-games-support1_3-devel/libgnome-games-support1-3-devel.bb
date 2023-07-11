SUMMARY = "Development files for the GNOME Internal games library"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support1_3-devel-1.8.2-1.8.aarch64.rpm"
RPM_HASH = "d9723334050567b70faa53f89b2d434e44ae93e50370ceac1531d28adcbfab5059a7d85d70a0116b83c7452193e75ae621c9493b3b173dabca129c0955ec287b"

RPROVIDES:${PN} += "libgnome-games-support1-3-devel \
pkgconfig-libgnome-games-support-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-games-support-1-3 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
