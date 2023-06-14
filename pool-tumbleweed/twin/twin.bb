SUMMARY = "Textmode WINdow environment"
DESCRIPTION = "Twin is a text-mode window environment. It supports mouse and multiple \
windows, has a built-in terminal emulator and window manager, and can \
serve as display for client applications. Its retro look-and-feel comes \
with very modern features: it is best described as a VNC-like server, \
that can use a variety of displays - all with mouse support: from a \
plain text terminal, to a Linux console, to a full kde, gnome or X11 \
desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "twin-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "b666c9a098c2392163449c1ac739ba832e274287ac4899af5cfea1046ae98252632ad9ade76e9d1f544ea4e9af96ae1c2fd94db0e0586c74e30563aa0fcafc02"

RPROVIDES:${PN} += "libhw-X11-0.9.1.so \
libhw-display-0.9.1.so \
libhw-tty-0.9.1.so \
libhw-twin-0.9.1.so \
libhw-xft-0.9.1.so \
librcparse-0.9.1.so \
libsocket-0.9.1.so \
libterm-0.9.1.so \
libwm-0.9.1.so \
twin"

RDEPENDS:${PN} += "/bin/bash \
/bin/true \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcrypt.so.1 \
libgpm.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libtstl.so.1 \
libtutf.so.1 \
libtw.so.1 \
libz.so.1"

inherit rpm
