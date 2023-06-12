SUMMARY = "Xfce Session Manager"
DESCRIPTION = "xfce4-session is the session manager for the Xfce desktop environment."
LICENSE = "GPL-2.0-only"

PV = "4.18.3"

RPM_NAME = "xfce4-session-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "90abde2a35783afc6329c4aad138c0e5e178b38a73b4b9842365d8d4a6129ab58f3274ea29a6bcfdbed16eab72007a8348eac3dcef10edea343f6c0cca85fce0"

RPROVIDES:${PN} += "application() \
application(xfce-session-settings.desktop) \
application(xfce4-session-logout.desktop) \
config(xfce4-session) \
xfce4-session \
xfce4-session(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
iceauth \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
systemd \
update-alternatives \
xfce4-session-branding \
xfce4-settings \
xfconf"

inherit rpm
