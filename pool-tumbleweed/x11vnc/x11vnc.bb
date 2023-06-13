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

RPM_NAME = "x11vnc-0.9.16-2.13.aarch64.rpm"
RPM_HASH = "96c876d5dfc6508d9caf71f7c66a5b04a4bb70cd761dd16c422f45dc78dea1b30e4b33fbb9755a2871f1db4d1f1ab68947afe1c2d6c4234a8701cbd5d6ee64bb"

RPROVIDES:${PN} += "application() \
application(x11vnc.desktop) \
x11vnc \
x11vnc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
iproute2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libvncclient.so.1()(64bit) \
libvncserver.so.1()(64bit)"

inherit rpm
