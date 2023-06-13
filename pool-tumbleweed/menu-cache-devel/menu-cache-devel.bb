SUMMARY = "Menu-cache Headers"
DESCRIPTION = "menu-cache development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "menu-cache-devel-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "55be6e79450e81caa80e04eb41af1ad421caa13ad4a6737ce8505e2c341c60f55212be23e8d5372d1e5831024dc4e6fc615d668e86de70766eb085e7e41cfea7"

RPROVIDES:${PN} += "menu-cache-devel \
menu-cache-devel(aarch-64) \
pkgconfig(libmenu-cache)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmenu-cache3 \
menu-cache \
pkgconfig(glib-2.0) \
pkgconfig(libfm-extra)"

inherit rpm
