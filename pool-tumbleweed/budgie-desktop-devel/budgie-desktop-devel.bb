SUMMARY = "Development files for the Budgie Desktop"
DESCRIPTION = "This package provides development files required for software to be \
able to use and link against the Budgie APIs, to create their own \
applets for the Budgie Panel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "budgie-desktop-devel-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "1495ac137f5bbb87ac3256ca24181f04b0e9f9f772455e479ebeb01f88a1b7fdef64734de3551fef7957cf025ae9b1915f41e3566d2b1e44ee8c9c65da498ae5"

RPROVIDES:${PN} += "budgie-desktop-devel \
pkgconfig-budgie-1.0 \
pkgconfig-budgie-raven-plugin-1.0 \
pkgconfig-budgie-theme-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbudgie-appindexer0 \
libbudgie-plugin0 \
libbudgie-private0 \
libbudgie-raven-plugin0 \
libbudgietheme0 \
libraven0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0"

inherit rpm
