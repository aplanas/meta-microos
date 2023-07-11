SUMMARY = "Development files for the Geany IDE"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-devel-1.38-3.8.aarch64.rpm"
RPM_HASH = "cadcdf9952cc3208f9d37ad3272b2c6ef222a520404aaf2ff1e89358e0dcd49778948470defbca1639127696c636479a72cca2ebddec7cc21f49a8400b2bfd7c"

RPROVIDES:${PN} += "geany-devel \
pkgconfig-geany"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geany \
gtk3-devel \
libgeany0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
