SUMMARY = "Advanced Gtk+ Sequencer library development files"
DESCRIPTION = "Advanced Gtk+ Sequencer library development files."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "gsequencer-devel-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "9808bacaa44bc5791edfd90936749427d8a4183d9bded76852d5f36738f5659828dd59579a2cbf595079eb48dce1e539d2f738a86df4840787dbfb6c61c869d8"

RPROVIDES:${PN} += "gsequencer-devel \
gsequencer-devel(aarch-64) \
pkgconfig(libags) \
pkgconfig(libags_audio) \
pkgconfig(libags_gui) \
pkgconfig(libgsequencer)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libags5 \
libgsequencer0 \
pkgconfig(alsa) \
pkgconfig(cairo) \
pkgconfig(fontconfig) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gthread-2.0) \
pkgconfig(gtk4) \
pkgconfig(jack) \
pkgconfig(libags) \
pkgconfig(libinstpatch-1.0) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
pkgconfig(sndfile) \
pkgconfig(uuid)"

inherit rpm
