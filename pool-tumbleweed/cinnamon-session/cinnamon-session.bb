SUMMARY = "The session manager for the Cinnamon Desktop"
DESCRIPTION = "This packages contains the session manager for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "cinnamon-session-5.2.0-2.7.aarch64.rpm"
RPM_HASH = "1ad2b0e5c4cc1aa2178ff1c21f8e3cb80310bee00faf65b68ca285be35d336431a34f29127281e02e268784134d077e83b5dd335ab4d9072f7bb66e6f9bda3b7"

RPROVIDES:${PN} += "cinnamon-session"

RDEPENDS:${PN} += "cinnamon \
cinnamon-settings-daemon \
dbus-1-x11 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXau.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsystemd.so.0 \
libxapp.so.1 \
upower"

inherit rpm
