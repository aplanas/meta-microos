SUMMARY = "CAD Program for the Design of Printed Circuit Boards"
DESCRIPTION = "pcb is a CAD (computer aided design) program for the physical design \
of printed circuit boards.  It has an autorouter, a trace optimizer a \
design rule checker and many more features. It can create RS-274-X \
(Gerber), Postscript, EPS and PNG output files."
LICENSE = "GPL-2.0-only"

PV = "4.3.0"

RPM_NAME = "pcb-4.3.0-1.11.aarch64.rpm"
RPM_HASH = "f95791a912f9d2ed70f5a5876f088d4d5055910c41dcbe9e5c28014c402fd8224d4d9a77bb9ddaf5a9683cf6aee38387a92fc43742d4923f901ecc72065558bb"

RPROVIDES:${PN} += "pcb"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/tclsh \
/usr/bin/wish \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgd.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgdkglext-x11-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkglext-x11-1.0.so.0 \
libm.so.6 \
m4"

inherit rpm
