SUMMARY = "Development files for the Budgie Desktop"
DESCRIPTION = "This package provides development files required for software to be \
able to use and link against the Budgie APIs, to create their own \
applets for the Budgie Panel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "budgie-desktop-devel-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "dcda83142f538ab77e1b9021ac227eacfd8022a54a74f3a1881b25815204e8eceeca402cded02fbd8c0e2fd0b42e913f528f99c3eaa3dcd6af4260ad1a894a87"

RPROVIDES:${PN} += "budgie-desktop-devel budgie-desktop-devel(aarch-64) pkgconfig(budgie-1.0) pkgconfig(budgie-raven-plugin-1.0) pkgconfig(budgie-theme-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbudgie-appindexer0 libbudgie-plugin0 libbudgie-private0 libbudgie-raven-plugin0 libbudgietheme0 libraven0 pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) pkgconfig(libpeas-1.0)"

inherit rpm
