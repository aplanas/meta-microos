SUMMARY = "System Load Information"
DESCRIPTION = "A small program which is mostly configurable using resources via \
~/.Xresources. It shows actual CPU, swap, memory, active interrupts, \
and, if desired, netpacket statistics in a graphical manner."
LICENSE = "GPL-2.0-or-later"

PV = "1.24"

RPM_NAME = "xosview-1.24-2.1.aarch64.rpm"
RPM_HASH = "9c4fabf04a9cf7ee7e470d70d89a48d60a1c2b61742c08bd16dcb7f03454484582ba2ddfda4e42784ec71412bda017a1be0f9e1744152c10b0211814ae8524ff"

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
