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

RPROVIDES:${PN} += "application() \
application(xfce4-power-manager-settings.desktop) \
config(xfce4-power-manager) \
metainfo() \
metainfo(xfce4-power-manager.appdata.xml) \
xfce4-power-manager \
xfce4-power-manager(aarch-64) \
xfce4-power-manager-doc"

RDEPENDS:${PN} += "/usr/bin/pkexec \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
systemd \
upower"

inherit rpm
