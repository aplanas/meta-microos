SUMMARY = "Power Management for the Xfce Desktop Environment"
DESCRIPTION = "The Xfce Power Manager is a tool for the Xfce desktop environment for managing \
profiles of policies which affect power consumption, such as the display \
brightness level, display sleep times, or CPU frequency scaling. It can also \
trigger actions on certain events such as closing the lid or reaching low \
battery levels and provides a set of interfaces to inform other applications \
about current power level so that they can adjust their power consumption. \
Furthermore, it provides a standardized inhibit interface which allows \
applications to prevent automatic sleep actions via the power manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-power-manager-4.18.2-1.1.aarch64.rpm"
RPM_HASH = "5db6f98e23b9b8897d35942ebc1b9354ad5e5ee172562715a689333d9357c44c85b0833daec4cad8958749847cbbc23ffe6ab9ba9914916b1e566c0e608107e2"

RPROVIDES:${PN} += "config-xfce4-power-manager \
xfce4-power-manager \
xfce4-power-manager-doc"

RDEPENDS:${PN} += "/usr/bin/pkexec \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
systemd \
upower"

inherit rpm
