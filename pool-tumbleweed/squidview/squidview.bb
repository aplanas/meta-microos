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

RPM_NAME = "squidview-0.86-1.22.aarch64.rpm"
RPM_HASH = "bdb922fd7536a1f36664831e027c117f406d4e05b40da0743516193c7f8b818a588c62d22e965615732fdf3407d186b975406554f2c7add282ea5adf77777e63"

RPROVIDES:${PN} += "squidview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
