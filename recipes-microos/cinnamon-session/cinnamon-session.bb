SUMMARY = "The session manager for the Cinnamon Desktop"
DESCRIPTION = "This packages contains the session manager for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "cinnamon-session-5.2.0-2.7.aarch64.rpm"
RPM_HASH = "1ad2b0e5c4cc1aa2178ff1c21f8e3cb80310bee00faf65b68ca285be35d336431a34f29127281e02e268784134d077e83b5dd335ab4d9072f7bb66e6f9bda3b7"

RPROVIDES:${PN} += "cinnamon-session \
cinnamon-session(aarch-64)"
RDEPENDS:${PN} += "cinnamon \
cinnamon-settings-daemon \
dbus-1-x11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
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
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxapp.so.1()(64bit) \
upower"

inherit rpm
