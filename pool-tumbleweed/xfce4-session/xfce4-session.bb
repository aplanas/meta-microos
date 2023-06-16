SUMMARY = "Xfce Session Manager"
DESCRIPTION = "xfce4-session is the session manager for the Xfce desktop environment."
LICENSE = "GPL-2.0-only"

PV = "4.18.3"

RPM_NAME = "xfce4-session-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "90abde2a35783afc6329c4aad138c0e5e178b38a73b4b9842365d8d4a6129ab58f3274ea29a6bcfdbed16eab72007a8348eac3dcef10edea343f6c0cca85fce0"

RPROVIDES:${PN} += "config-xfce4-session \
xfce4-session"

RDEPENDS:${PN} += "/usr/bin/sh \
iceauth \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
systemd \
update-alternatives \
xfce4-session-branding \
xfce4-settings \
xfconf"

inherit rpm
