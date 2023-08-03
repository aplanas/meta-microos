SUMMARY = "X11 library for Ghostscript"
DESCRIPTION = "This package contains the X11 library which is needed \
to view PostScript and PDF files with Ghostscript \
under the X Window System."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-x11-9.56.1-5.1.aarch64.rpm"
RPM_HASH = "06eccc73b76fc924307d49ec5a7d0ccf69c5752bada0e50fa3b67a8614cc959719aefa9b2ba1d4bd2cdaaf3672b50249b314e1e7e6df30806542e0b159a85592"

RPROVIDES:${PN} += "ghostscript-x11"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
