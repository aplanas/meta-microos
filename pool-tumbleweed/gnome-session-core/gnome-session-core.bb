SUMMARY = "Minimal version of the GNOME Session Manager"
DESCRIPTION = "This package contains a minimal version of gnome-session, that can be \
used for specific cases. The gnome-session package is needed for a fully \
functional GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-core-44.0-2.1.aarch64.rpm"
RPM_HASH = "16dec0b01abfcce969041a48c4653878dfb7226d6d3969c99bfe5ed7486bba4f6a993554b329548bcd7be1fb76d9d7c817ba403b2906af01e7d911b94c168ee3"

RPROVIDES:${PN} += "gnome-session-core \
gnome-session-core(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/dbus-launch \
gsettings-desktop-schemas \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
