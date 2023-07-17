SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.108.0"

RPM_NAME = "syntax-highlighting-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d3511334f9ac8ea04a320f83d7310b33ea7cdfcf30ce40b038c50f293eb9d7ca3d4f81846915996a69d426533279f321cc32bd12158d34182ed1efd64b1e69fb"

RPROVIDES:${PN} += "syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
