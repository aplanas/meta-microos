SUMMARY = "X Window System initializer"
DESCRIPTION = "The xinit program is used to start the X Window System server and a \
first client program on systems that are not using a display manager \
such as xdm or in environments that use multiple window systems. \
When this first client exits, xinit will kill the X server and then \
terminate."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "xinit-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "ea20ac371c0e37bc8548759bffac1c73a64dc8b651ff9fc88bf133dc2bcbbe4c0b7efd00edd7118351da75d8cf2db09fde83723f9df387073b7b13f3b52ba567"

RPROVIDES:${PN} += "config-xinit \
xinit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
setxkbmap \
xauth \
xmodmap \
xrdb \
xsetroot \
xterm-bin"

inherit rpm
