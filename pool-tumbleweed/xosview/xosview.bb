SUMMARY = "System Load Information"
DESCRIPTION = "A small program which is mostly configurable using resources via \
~/.Xresources. It shows actual CPU, swap, memory, active interrupts, \
and, if desired, netpacket statistics in a graphical manner."
LICENSE = "GPL-2.0-or-later"

PV = "1.24"

RPM_NAME = "xosview-1.24-3.1.aarch64.rpm"
RPM_HASH = "1eca216805d2b433e91701ec0ca2a1f1574297203f0f61e67c3307cf34d7e034bc32690a61cb3a4412e74549a7ec2dc012c63a5200a3758ab68291cd1fba1f0e"

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
