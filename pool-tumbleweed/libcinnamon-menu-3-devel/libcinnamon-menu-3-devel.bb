SUMMARY = "Libraries and development headers for cinnamon-menus"
DESCRIPTION = "This package provides the necessary development libraries for \
writing applications that use the Cinnamon menu system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "libcinnamon-menu-3-devel-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "86d063b4a296a7075d657012b61cfe7e6d395fa3314479bc01987fb1aa87a9ccfebd18a854a0a7e9b713c5aaadd593e05f41a26aa0242fcfc2bc46651da527f1"

RPROVIDES:${PN} += "libcinnamon-menu-3-devel \
libcinnamon-menu-3-devel(aarch-64) \
pkgconfig(libcinnamon-menu-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcinnamon-menu-3-0 \
pkgconfig(gio-unix-2.0) \
typelib-1_0-CMenu-3_0"

inherit rpm
