SUMMARY = "C source code complexity computation utility"
DESCRIPTION = "Complexity is a tool for analyzing the complexity of 'C' program functions. \
It is very similar to the McCabe scoring, but addresses some issues not considered \
in that scoring scheme."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "complexity-1.10-5.6.aarch64.rpm"
RPM_HASH = "9831c04677b3cb94bcaabbf86061964c559b00409735be9c8b48c7eddb8c2753b55a3f1fbdbfe01346b6d96691966957ac3119b565b1b47baffaf562c1cf99ac"

RPROVIDES:${PN} += "complexity \
complexity(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libopts.so.25()(64bit)"

inherit rpm
