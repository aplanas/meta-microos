SUMMARY = "Development files for the Geany IDE"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-devel-1.38-3.7.aarch64.rpm"
RPM_HASH = "a811a1a371c5bf6cac13c06ddde6a5f5752bc223f48a4d8778c14b67209e13202f3841fc653bb852f046250ee380e18fbcb2cda2ca2d4e76c158b12a57433640"

RPROVIDES:${PN} += "geany-devel \
geany-devel(aarch-64) \
pkgconfig(geany)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geany \
gtk3-devel \
libgeany0 \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
