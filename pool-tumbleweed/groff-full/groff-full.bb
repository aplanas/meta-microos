SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-full-1.22.4-10.3.aarch64.rpm"
RPM_HASH = "0c014abb08ae62ff109e0a1e6935e8d8340b0ad2154c1cd4eccb152d1d76de796ff48d3fb47c576e858427ab3d60fec5edf276bcd9241480c2168df193a484cd"

RPROVIDES:${PN} += "groff-devx \
groff-full \
jgroff \
normal-groff"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
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
