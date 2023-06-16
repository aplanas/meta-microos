SUMMARY = "Utility to test X11 server performance"
DESCRIPTION = "The x11perf program runs one or more performance tests and reports how \
fast an X server can execute the tests."
LICENSE = "HPND"

PV = "1.6.2"

RPM_NAME = "x11perf-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "3bc528fd06663c8a1f077995eacca09ec73f2865597bbce8bb270574ff04ec8aa143e856b40a8cb4283aaa3a2e887166aef4e0f1ef6bb39f35fd6307fc42681d"

RPROVIDES:${PN} += "x11perf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmuu.so.1 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
