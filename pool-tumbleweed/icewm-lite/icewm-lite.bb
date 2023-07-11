SUMMARY = "Window Manager with a Taskbar -- Lite Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "icewm-lite-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "c7ee3fed85e3b8d600652d8cf2b5647c7cc8521240465b0b070cbd167a4657e8444083fd2d59fc189c4341df1e2a1ae34b8058bf117ed9333d9a28501f83d0d4"

RPROVIDES:${PN} += "icewm-bin \
icewm-lite"

RDEPENDS:${PN} += "/usr/bin/sh \
icewm \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libImlib2.so.1 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
