SUMMARY = "GNOME Music Management Application"
DESCRIPTION = "Music Management application with support for ripping audio-CD's, \
playback of Ogg Vorbis and MP3 and burning of CD-ROMs."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "rhythmbox-3.4.7-1.1.aarch64.rpm"
RPM_HASH = "65995107a222179097c149e9a7a8fb7347ac89eec350501af34985eeda14bb1d98221f44932c0f2cd6c4a1843e8c9025ce73a459dd02e56845c32f086a88dc6f"

RPROVIDES:${PN} += "libandroid.so \
libaudiocd.so \
libaudioscrobbler.so \
libcd-recorder.so \
libdaap.so \
libdbus-media-server.so \
libfmradio.so \
libgeneric-player.so \
libgrilo.so \
libipod.so \
libiradio.so \
libmpris.so \
libmtpdevice.so \
libnotification.so \
libpower-manager.so \
librblirc.so \
librhythmbox-core.so.10 \
rhythmbox \
typelib-MPID \
typelib-RB"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libbrasero-media3.so.1 \
libc.so.6 \
libcairo.so.2 \
libdmapsharing-4.0.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgrilo-0.3.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
liblirc-client.so.0 \
libm.so.6 \
libmtp.so.9 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libtdb.so.1 \
libtotem-plparser.so.18 \
libxml2.so.2 \
python3-gobject \
python3-gobject-Gdk \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-Peas \
typelib-PeasGtk \
typelib-RB \
typelib-Secret \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
