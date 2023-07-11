SUMMARY = "Glade catalog for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides a catalog for Glade, to allow the use the libpeas \
widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "glade-catalog-libpeas-1.36.0-1.2.noarch.rpm"
RPM_HASH = "ef64d90c3c14f8db3ac7e0228076a3c68cf2e47a0ade64ac7075a1d0ca837e98b039a8bc1048e4b2b492e6acbf5e508d35faf6ee9197426d99abb7a4f1197a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-catalog-libpeas"

RDEPENDS:${PN} += "glade \
libpeas-gtk-1-0-0"

inherit rpm
