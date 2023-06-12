SUMMARY = "Pulseaudio Volume Control Plugin for the Xfce Panel"
DESCRIPTION = "Xfce4-pulseaudio-plugin is a panel plugin for controlling an audio \
output volume of the PulseAudio mixer. The volume can be adjusted using \
keyboard shortcuts, mouse wheel, a slider in a popup menu, or via \
a linked external audio mixer tool."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "xfce4-pulseaudio-plugin-0.4.6-1.1.aarch64.rpm"
RPM_HASH = "3e4d45cefd0ba12ca6e03b813d059b5fede59bddfe549d681f075efc6d53e47e9f749c1870fb2c4a258f1b3256fcbb6f2be9a7783503df41f71f3f72d5c6f13f"

RPROVIDES:${PN} += "libpulseaudio-plugin.so()(64bit) \
xfce4-panel-plugin-pulseaudio \
xfce4-pulseaudio-plugin \
xfce4-pulseaudio-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libcanberra.so.0()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libkeybinder-3.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
pulseaudio-daemon \
xfce4-panel"

inherit rpm
