SUMMARY = "A quick previewer for Nemo file manager"
DESCRIPTION = "This is NemoPreview, a quick previewer for Nemo, the Cinnamon \
desktop file manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-preview-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "ef0fe5242669ac9629787ae611ef8c750b54acafa1d7285746d8b68b65307597dec39ed8e7c3f74aa24ac387cdf42cfc437b30f533ba9e42f49f80ed3c8a268e"

RPROVIDES:${PN} += "libnemo-preview-1.0.so \
nemo-extension-preview \
nemo-extension-preview-devel \
nemo-preview \
typelib-NemoPreview"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libcjs.so.0 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0 \
libxreaderdocument.so.3 \
libxreaderview.so.3 \
nemo \
typelib-Atk \
typelib-Clutter \
typelib-ClutterGst \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo \
typelib-Gtk \
typelib-GtkClutter \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Json \
typelib-NemoPreview \
typelib-Pango \
typelib-PangoCairo \
typelib-WebKit2 \
typelib-XreaderDocument \
typelib-XreaderView \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
