SUMMARY = "Header files for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains all necessary include files and libraries \
needed to develop applications that require libmetacity."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-devel-3.46.1-1.1.aarch64.rpm"
RPM_HASH = "e2ead4fbb15b015fe445480bcce15fd465ecc01ca60d5d004d0a9c52b12020e1f8f48a95626fbab3014f794da40d13337f94ebed1ffa873fc8cdf023567519e2"

RPROVIDES:${PN} += "metacity-devel \
metacity-devel(aarch-64) \
pkgconfig(libmetacity)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetacity3 \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
