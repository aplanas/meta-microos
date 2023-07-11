SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.4.0"

RPM_NAME = "gsequencer-devel-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "85043669071631270431540bb517e2ce2aac31bed634a2c77001595c0e749cd7624dc273090cf3b3eb62320f8418bd3a013dc9597b3a009ca30a00884c49efa5"

RPROVIDES:${PN} += "gsequencer-devel \
pkgconfig-libags \
pkgconfig-libags-audio \
pkgconfig-libags-gui \
pkgconfig-libgsequencer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libags5 \
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
