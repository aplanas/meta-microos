SUMMARY = "Pulseaudio Volume Control Plugin for the Xfce Panel"
DESCRIPTION = "Xfce4-pulseaudio-plugin is a panel plugin for controlling an audio \
output volume of the PulseAudio mixer. The volume can be adjusted using \
keyboard shortcuts, mouse wheel, a slider in a popup menu, or via \
a linked external audio mixer tool."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.7"

RPM_NAME = "xfce4-pulseaudio-plugin-0.4.7-1.1.aarch64.rpm"
RPM_HASH = "35a649b85388794cc24f7de00b82749bc967894cbbe9c34f48edb6ad0dc4193453dbe60f067a6a5d5b89f4b219a4c19c4f45e0b04747491186dde848258e7e80"

RPROVIDES:${PN} += "libpulseaudio-plugin.so \
xfce4-panel-plugin-pulseaudio \
xfce4-pulseaudio-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libnotify.so.4 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
pulseaudio-daemon \
xfce4-panel"

inherit rpm
