SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.8"

RPM_NAME = "gsequencer-devel-6.0.8-1.1.aarch64.rpm"
RPM_HASH = "8d1a21e7cd6161c2188ff6021f7865318316bd34606bdd390c6a74b927d0ea934c2c94867959254b595a629cbc06d8ca6f9d9876e0b1603b5590cc60d5ea5251"

RPROVIDES:${PN} += "gsequencer-devel \
pkgconfig-libags \
pkgconfig-libags-audio \
pkgconfig-libags-gui \
pkgconfig-libgsequencer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libags6 \
libgsequencer0 \
pkgconfig-alsa \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk4 \
pkgconfig-jack \
pkgconfig-libags \
pkgconfig-libinstpatch-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sndfile \
pkgconfig-uuid"

inherit rpm
