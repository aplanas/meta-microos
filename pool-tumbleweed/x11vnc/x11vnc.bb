SUMMARY = "VNC Server for Real X Displays"
DESCRIPTION = "x11vnc allows one to remotely view and interact with real X displays (i.e. a \
display corresponding to a physical monitor, keyboard, and mouse) with any VNC \
viewer. In this way it plays the role for Unix/X11 that WinVNC plays for \
Windows. \
 \
For Unix, the VNC implementation includes a virtual X11 server Xvnc (usually \
launched via the vncserver command) that is not associated with a real \
display, but provides a 'fake' one X11 clients (xterm, mozilla, etc.) can \
attach to. A remote user then connects to Xvnc via the VNC client vncviewer \
from anywhere on the network to view and interact with the whole virtual X11 \
desktop. \
 \
The VNC protocol is in most cases better suited for remote connections with \
low bandwidth and high latency than is the X11 protocol. Also, with no state \
maintained the viewing-end can crash, be rebooted, or relocated and the \
applications and desktop continue running. Not so with X11."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.16"

RPM_NAME = "x11vnc-0.9.16-2.14.aarch64.rpm"
RPM_HASH = "9ddc484542be55d3b4fdb4fea29b018697778baae54787eaae862d9370a6a64e26b3d1a69730a2a1dfbc5773799da166ad8a6b56bc89ed1b73341368ff8b78c9"

RPROVIDES:${PN} += "x11vnc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
iproute2 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libssl.so.3 \
libvncclient.so.1 \
libvncserver.so.1"

inherit rpm
