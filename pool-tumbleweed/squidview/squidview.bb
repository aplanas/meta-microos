SUMMARY = "Interactive console program which monitors squid logs access"
DESCRIPTION = "Squidview is an interactive console program which monitors \
and displays squid logs in a nice fashion, and may then go \
deeper with searching and reporting functions. \
 \
If you don't know what squid is or does this program is probably not for you. \
 \
To use squidview you must at least have read access to squid's \
access.log file. You may need to see your administrator for this. \
Squidview uses this text log file for all operations. \
It does not generate its own database for tasks"
LICENSE = "GPL-2.0"

PV = "0.86"

RPM_NAME = "squidview-0.86-1.23.aarch64.rpm"
RPM_HASH = "b1fb15289e311590f8c310edc27f74aba180441cc1506f547515e4f5bfe18ec5fb044f008d8231f242debd2ab949d76265876f58beef100c18ae5d69754879cf"

RPROVIDES:${PN} += "squidview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
