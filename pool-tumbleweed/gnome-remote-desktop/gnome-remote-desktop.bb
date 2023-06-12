SUMMARY = "GNOME Remote Desktop screen sharing service"
DESCRIPTION = "GNOME Remote Desktop is a remote desktop and screen sharing service for the \
GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-remote-desktop-44.2-1.1.aarch64.rpm"
RPM_HASH = "4994e5990f36d2d9ff59136354955cf8c1fda0cc4134c10c898978d6fc75ae572fba5953a768862d6da53a4385fad20b9d909b66d8715a4c662f3aa10eb7aebd"

RPROVIDES:${PN} += "gnome-remote-desktop \
gnome-remote-desktop(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfdk-aac.so.2()(64bit) \
libfreerdp-server2.so.2()(64bit) \
libfreerdp2.so.2()(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libtss2-esys.so.0()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-rc.so.0()(64bit) \
libtss2-tctildr.so.0()(64bit) \
libvncserver.so.1()(64bit) \
libwinpr2.so.2()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit) \
pipewire"

inherit rpm
