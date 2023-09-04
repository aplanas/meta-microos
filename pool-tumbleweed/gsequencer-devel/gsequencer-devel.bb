SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.1"

RPM_NAME = "gsequencer-devel-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "55160c030f1d703521498d95b0142fd5db1ed1fc45f54823f4fbda526d1dc6ebf73eef1cfbf9e4df2f26a0c03062005fe3b17588c016259c6beab0de56b650b2"

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
