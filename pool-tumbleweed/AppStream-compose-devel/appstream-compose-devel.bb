SUMMARY = "Header files for AppStream Compose support"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support using compose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "AppStream-compose-devel-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "5f68245ee6326b72c3dab33228c89dca24c4faa06edc35834d2ed8c63efbf52f8938aba20f8adbbc2e2229b4a2e4ca2aaa9587d43fa113546a9ce4e8d37c1640"

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
