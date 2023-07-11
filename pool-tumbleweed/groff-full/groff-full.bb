SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-full-1.22.4-10.5.aarch64.rpm"
RPM_HASH = "0c5996f66ca194e782c9ecc5c1e1ef3dfb18003ed0592638daf322ed82a6572839e506e18b4e4bf36bd56579e64ab2ddc11511bd4c524d1f4e7bf5292f75120f"

RPROVIDES:${PN} += "groff-devx \
groff-full \
jgroff \
normal-groff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ghostscript-library \
groff \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
netpbm \
psutils \
update-alternatives"

inherit rpm
