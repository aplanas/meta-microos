SUMMARY = "Development files for the Budgie Desktop"
DESCRIPTION = "This package provides development files required for software to be \
able to use and link against the Budgie APIs, to create their own \
applets for the Budgie Panel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-devel-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "f8677138281b4fe63a0923d5bc53269a01890980355ccda03f8cdd497ceba9b2b2d72db1617b55ecc1dec8c5c8f9e132b76fb350b174ab6a54ed8d2867a40349"

RPROVIDES:${PN} += "budgie-desktop-devel budgie-desktop-devel(aarch-64) pkgconfig(budgie-1.0) pkgconfig(budgie-raven-plugin-1.0) pkgconfig(budgie-theme-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbudgie-appindexer0 libbudgie-plugin0 libbudgie-private0 libbudgie-raven-plugin0 libbudgietheme0 libraven0 pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) pkgconfig(libpeas-1.0)"

inherit rpm
