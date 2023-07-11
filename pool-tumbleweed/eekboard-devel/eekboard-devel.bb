SUMMARY = "Development Files for libskk"
DESCRIPTION = "The eekboard-devel package contains the header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-devel-1.0.8-10.10.aarch64.rpm"
RPM_HASH = "656a35c2e8bf831a57a49ee4cdc4997eb18180a89f16493396c104b3d790d3a5ff0d12b805d8136bc9c0ed44d34991cd8cfb6919a0ef3f52fbc0cfe61940fee0"

RPROVIDES:${PN} += "eekboard-devel \
pkgconfig-eek-0.90 \
pkgconfig-eek-gtk-0.90 \
pkgconfig-eek-xkl-0.90 \
pkgconfig-eekboard-0.90"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eekboard \
pkgconfig-eek-0.90 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxklavier"

inherit rpm
