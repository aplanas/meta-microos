SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.107.0"

RPM_NAME = "syntax-highlighting-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2606364bd97e1adf45583943b385be68a4e9c48117c94a35e4e247246890b23a505b1df1cebbf4e147aae217b9bca273b9e1114e6ecdd58cf691b20f3609966f"

RPROVIDES:${PN} += "syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
