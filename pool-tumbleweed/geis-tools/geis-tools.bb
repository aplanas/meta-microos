SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-tools-2.2.17-4.9.aarch64.rpm"
RPM_HASH = "d8c3bd43c909642ddb6e4bdacfac99bcc81bd74e8cde6f15f1acebff2944812bb4c6bec972685e84367225cfed5abc287bdab12ed5bf69fbe843dbf4fce67c5c"

RPROVIDES:${PN} += "application() \
application(geisview.desktop) \
geis-tools \
geis-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgeis.so.1()(64bit) \
libgeis.so.1(GEIS_1.0)(64bit) \
libxcb.so.1()(64bit) \
python3-geis"

inherit rpm
