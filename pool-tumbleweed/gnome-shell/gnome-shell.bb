SUMMARY = "GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-44.2-1.1.aarch64.rpm"
RPM_HASH = "38c94554a1ac94d8cfa028c9327d82b02a36e8686aae95570a83df535ef2523d929d8fc347920858044e5fb274b2e5fecabc94cc1793cdc30a7788e69106dfde"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
gnome-shell \
libgnome-shell-menu.so \
libgvc.so \
libshell-12.so \
libshew-0.so \
libst-12.so \
typelib-Gvc \
typelib-Shell \
typelib-Shew \
typelib-St"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gdk-pixbuf-loader-rsvg \
gnome-control-center \
gnome-session \
gnome-settings-daemon \
gnome-themes-accessibility \
gsettings-desktop-schemas \
gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXfixes.so.3 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmutter-12.so.0 \
libmutter-clutter-12.so.0 \
libmutter-cogl-12.so.0 \
libmutter-cogl-pango-12.so.0 \
libnm.so.0 \
libpango-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsecret-1.so.0 \
libsystemd.so.0 \
mutter \
typelib-AccountsService \
typelib-Adw \
typelib-Atk \
typelib-Atspi \
typelib-Cally \
typelib-GDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GWeather \
typelib-Gck \
typelib-Gcr \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gdm \
typelib-Geoclue \
typelib-Gio \
typelib-GnomeBG \
typelib-GnomeBluetooth \
typelib-GnomeDesktop \
typelib-Graphene \
typelib-Gsk \
typelib-Gst \
typelib-Gtk \
typelib-Gvc \
typelib-HarfBuzz \
typelib-IBus \
typelib-Json \
typelib-Malcontent \
typelib-NM \
typelib-NMA4 \
typelib-Pango \
typelib-PangoCairo \
typelib-Polkit \
typelib-PolkitAgent \
typelib-Rsvg \
typelib-Shell \
typelib-Shew \
typelib-Soup \
typelib-TelepathyGLib \
typelib-TelepathyLogger \
typelib-UPowerGlib \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
