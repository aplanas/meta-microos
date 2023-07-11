SUMMARY = "GNOME Remote Desktop screen sharing service"
DESCRIPTION = "GNOME Remote Desktop is a remote desktop and screen sharing service for the \
GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-remote-desktop-44.2-1.2.aarch64.rpm"
RPM_HASH = "8a65063d0050c31c8c853bbd2f24a2e13c44cc21807c6f0b611ff61e6a80b398a0b684eac7ef256023f55f6c49c8f02cdc6e0762fde635d5cac1dbe323d7fc27"

RPROVIDES:${PN} += "gnome-remote-desktop"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libfdk-aac.so.2 \
libfreerdp-server2.so.2 \
libfreerdp2.so.2 \
libfuse3.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libpipewire-0.3.so.0 \
libsecret-1.so.0 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0 \
libvncserver.so.1 \
libwinpr2.so.2 \
libxkbcommon.so.0 \
pipewire"

inherit rpm
