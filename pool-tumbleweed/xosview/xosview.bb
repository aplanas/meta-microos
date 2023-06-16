SUMMARY = "System Load Information"
DESCRIPTION = "A small program which is mostly configurable using resources via \
~/.Xresources. It shows actual CPU, swap, memory, active interrupts, \
and, if desired, netpacket statistics in a graphical manner."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "xosview-1.23-1.3.aarch64.rpm"
RPM_HASH = "a8b1c2e5741465ffe4383c1ee9215a5cdf6a366163d4a40324c210777da8551316b840b0d48f3486926c59ae739bbbf413f14748f79a5c7ebcbdf69ee6111b91"

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
