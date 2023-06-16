SUMMARY = "MATE Session Manager"
DESCRIPTION = "This package contains a session that can be started from a display \
manager such as LightDM. It will load all necessary applications \
for a full-featured user session."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "cace1c4714de2b7971341b226cb8f7442b0d77bf86e78af1be9167913178609459940d1ce5b1dc70b1218e4d7f12ac4ccf0f13bf7e36a08ae15e276b6ef72220"

RPROVIDES:${PN} += "config-mate-session-manager \
mate-session-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
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
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libqt5-qtstyleplugins-platformtheme-gtk2 \
libsystemd.so.0 \
mate-session-manager-branding \
mate-session-manager-gschemas \
update-alternatives"

inherit rpm
