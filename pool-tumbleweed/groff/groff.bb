SUMMARY = "GNU troff Document Formatting System"
DESCRIPTION = "The groff package is a stripped-down package containing the necessary \
components to read manual pages in ASCII, Latin-1, and UTF-8, plus the \
PostScript device (groff's default)."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "groff-1.22.4-10.3.aarch64.rpm"
RPM_HASH = "d4b0bc7ee6392a246f032792d229d8e00af98f5db7329c03cdab3112596c99c22e1e7f9b3cc84548b7969722be5552e1efc99d01cbf15987a50fcb0eb8e0b5eb"

RPROVIDES:${PN} += "config(groff) \
groff \
groff(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
