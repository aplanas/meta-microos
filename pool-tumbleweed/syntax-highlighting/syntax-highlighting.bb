SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "syntax-highlighting-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ce08377bb1dc06e6d388ac0f9493291e208653f5a78f64bd07ef4958eac471e1648377fc2ff620ebd661bf9fdfdab9a856d4999c1b4e276c2b0e3bc6da9c0831"

RPROVIDES:${PN} += "syntax-highlighting"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
