SUMMARY = "X11 library for Ghostscript"
DESCRIPTION = "This package contains the X11 library which is needed \
to view PostScript and PDF files with Ghostscript \
under the X Window System."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-x11-9.56.1-4.1.aarch64.rpm"
RPM_HASH = "25e601170bb8a11fe78ac2df6e7dcc7f8e0e20cc04392726befd1bb04739e6174972d7e7d16b8541af7db8e9fe81f20d368a710c004fda1e4c5558f2f3981601"

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
