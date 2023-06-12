SUMMARY = "MATE Session Manager"
DESCRIPTION = "This package contains a session that can be started from a display \
manager such as LightDM. It will load all necessary applications \
for a full-featured user session."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "cace1c4714de2b7971341b226cb8f7442b0d77bf86e78af1be9167913178609459940d1ce5b1dc70b1218e4d7f12ac4ccf0f13bf7e36a08ae15e276b6ef72220"

RPROVIDES:${PN} += "application() \
application(mate-session-properties.desktop) \
config(mate-session-manager) \
mate-session-manager \
mate-session-manager(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXext.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libqt5-qtstyleplugins-platformtheme-gtk2 \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
mate-session-manager-branding \
mate-session-manager-gschemas \
update-alternatives"

inherit rpm
