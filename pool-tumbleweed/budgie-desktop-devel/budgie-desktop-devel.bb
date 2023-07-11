SUMMARY = "Development files for the Budgie Desktop"
DESCRIPTION = "This package provides development files required for software to be \
able to use and link against the Budgie APIs, to create their own \
applets for the Budgie Panel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-devel-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "36b140539000b7edd7043ed221ecd4f0873b3faa871cf6b62109b0235498855993fbfbb4a93f9761d0d5eba39b2ba3ec4231ffb0114ed7e0bc0af7eff03a9db3"

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
