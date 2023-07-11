SUMMARY = "Window Manager with a Taskbar"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "icewm-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "27f62d08e1b5fa334204a46a024e2533b3ddc368e774f0ca59d8a5e14f0b09998891fa0b1dc0c84648114c722fb7237973114e3e31acee90afec64e5bd3bb151"

RPROVIDES:${PN} += "icewm \
icewm-gnome \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
alsa-utils \
desktop-data \
icewm-bin \
icewm-configuration-files \
imlib2-loaders \
update-alternatives \
xdg-menu \
xterm-bin"

inherit rpm
