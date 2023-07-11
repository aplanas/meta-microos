SUMMARY = "System Load Information"
DESCRIPTION = "A small program which is mostly configurable using resources via \
~/.Xresources. It shows actual CPU, swap, memory, active interrupts, \
and, if desired, netpacket statistics in a graphical manner."
LICENSE = "GPL-2.0-or-later"

PV = "1.24"

RPM_NAME = "xosview-1.24-1.1.aarch64.rpm"
RPM_HASH = "4b37862322e31e7486f4e4278890e2d14e57ef1fccec91ac6f629290a4e8b0e8cc2d9546627a4ec828e0335ace7540de959d0e58908e2952f0f7c34b4e458d7e"

RPROVIDES:${PN} += "config-xosview \
xosview"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
sed \
xrdb"

inherit rpm
