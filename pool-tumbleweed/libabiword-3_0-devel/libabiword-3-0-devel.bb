SUMMARY = "A Multiplatform Word Processor - Development files"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "libabiword-3_0-devel-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "bda1481c4a31999f8e897df579372e25209b108bcacd1ded9abb96619486a36783a4b41cdffa88383f2eb2fe16b655d5ca4f58a64accd3e836eeab131a0af9dd"

RPROVIDES:${PN} += "abiword-devel \
libabiword-3_0-devel \
libabiword-3_0-devel(aarch-64) \
pkgconfig(abiword-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
enchant-devel \
fribidi-devel \
glib2-devel \
goffice-devel \
gtk3-devel \
libabiword-3_0 \
libgsf-devel \
librsvg-devel \
pango-devel \
pkgconfig(cairo-fc) \
pkgconfig(cairo-pdf) \
pkgconfig(cairo-ps) \
pkgconfig(enchant) \
pkgconfig(fribidi) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gthread-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtk+-unix-print-3.0) \
pkgconfig(libgoffice-0.10) \
pkgconfig(libgsf-1) \
pkgconfig(librsvg-2.0) \
pkgconfig(libxslt) \
pkgconfig(pangocairo) \
pkgconfig(wv-1.0) \
pkgconfig(x11) \
wv-devel"

inherit rpm
