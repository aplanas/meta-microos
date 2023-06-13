SUMMARY = "Development files for gaming input devices"
DESCRIPTION = "This package contains the header files, static libraries and \
development documentation for libgaminggear. If you like to develop \
programs using libgaminggear, you will need to install this package."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggear-devel-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "e37bded94f5e9046eadd30f8e102817f340c3077d38dcf9e9b14dfcf24f6ac7518b4bdb0b2e1063f27f0ec03d32f744fccfb5b3a90006ba044551c90ee7bd480"

RPROVIDES:${PN} += "libgaminggear-devel \
libgaminggear-devel(aarch-64) \
pkgconfig(gaminggear-0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgaminggear0 \
libgaminggearfx0 \
libgaminggearwidget0 \
pkgconfig(gdk-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-2.0) \
pkgconfig(libcanberra) \
pkgconfig(libnotify) \
pkgconfig(sqlite3)"

inherit rpm
