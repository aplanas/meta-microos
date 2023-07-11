SUMMARY = "Media Player for the Xfce Desktop Environment"
DESCRIPTION = "Parole is a media player based on the GStreamer framework and written \
to fit in the Xfce desktop. Parole features playback of local media \
files, DVD/CD and live streams. Parole is extensible via plugins; for \
a how-to document for writing a Parole plugin, see the Plugins API \
documentation and the plugins directory which contains some examples."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-4.18.0-1.4.aarch64.rpm"
RPM_HASH = "58c820d397d236e979268cfd9c3d9544a6ee8ef9a37b755e7ab9451fda4b7fdb10dee0ef75eae20dcc6e39c6f853d17f8831e3bd8f39129a84af65a217449b9c"

RPROVIDES:${PN} += "parole"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libtag-c.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
