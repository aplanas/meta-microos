SUMMARY = "Magpie is a softish fork of Mutter"
DESCRIPTION = "Magpie is a soft-fork of GNOME's mutter \
at version 43 tailored to the requirements \
of the Budgie Desktop 10 series (from v10.8 and later)."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3+0"

RPM_NAME = "magpie-0.9.3+0-2.1.aarch64.rpm"
RPM_HASH = "b500dc5dc0949614fad7d8b41ceb0d1700ac018e294ab6e7a1335b60e76ca18a84cd2eea340bde0d03c1f7377ff4744a312b670014bdceeebf4b3bbcbd148a8c"

RPROVIDES:${PN} += "libmagpie-0.so.0 \
libmagpie-clutter-0.so.0 \
libmagpie-cogl-0.so.0 \
libmagpie-cogl-pango-0.so.0 \
magpie \
typelib-Cally \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-Meta"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra.so.0 \
libcolord.so.2 \
libdrm.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgbm.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libinput.so.10 \
libjson-glib-1.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpipewire-0.3.so.0 \
libstartup-notification-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libwacom.so.9 \
libxcb-randr.so.0 \
libxcb-res.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
mutter \
typelib-Atk \
typelib-GDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
