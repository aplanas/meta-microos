SUMMARY = "Window Manager with a Taskbar"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "icewm-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "6122e836e0658b82d3e3cd8a6e4eda6aacd8099606b6198a60722aafcc931346f2bdaf1258f03b8f145bc37f377907ac0a7c21f830bdc7f5d61c4ec8c251fa42"

RPROVIDES:${PN} += "icewm \
icewm-gnome \
windowmanager"

RDEPENDS:${PN} += "/bin/sh \
alsa-utils \
desktop-data \
icewm-bin \
icewm-configuration-files \
imlib2-loaders \
update-alternatives \
xdg-menu \
xterm-bin"

inherit rpm
