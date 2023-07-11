SUMMARY = "Header files for AppStream Compose support"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support using compose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "AppStream-compose-devel-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "8cfa6e807cd247c7290ad7db932a5fc2e94abc263339039af22314897c4306aaa239ea3eaf3f4f9f5b551049635a4e3ed30bc0000304525ee51e2217dc206482"

RPROVIDES:${PN} += "AppStream-compose-devel \
pkgconfig-appstream-compose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
AppStream-compose \
pkgconfig-appstream \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
