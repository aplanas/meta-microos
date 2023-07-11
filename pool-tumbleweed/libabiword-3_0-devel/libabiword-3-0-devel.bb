SUMMARY = "A Multiplatform Word Processor - Development files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "libabiword-3_0-devel-3.0.5-2.10.aarch64.rpm"
RPM_HASH = "da310c7961104b6841d055dc595f7f46edaa0d22887765ae5e726dc77fb6d823f6845bc0bcb8bf61235d4d296e197f90c70a36dab891ed7f37f3f19bfaf2cd88"

RPROVIDES:${PN} += "abiword-devel \
libabiword-3-0-devel \
pkgconfig-abiword-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
enchant-devel \
fribidi-devel \
glib2-devel \
goffice-devel \
gtk3-devel \
libabiword-3-0 \
libgsf-devel \
librsvg-devel \
pango-devel \
pkgconfig-cairo-fc \
pkgconfig-cairo-pdf \
pkgconfig-cairo-ps \
pkgconfig-enchant \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk+-unix-print-3.0 \
pkgconfig-libgoffice-0.10 \
pkgconfig-libgsf-1 \
pkgconfig-librsvg-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
pkgconfig-wv-1.0 \
pkgconfig-x11 \
wv-devel"

inherit rpm
