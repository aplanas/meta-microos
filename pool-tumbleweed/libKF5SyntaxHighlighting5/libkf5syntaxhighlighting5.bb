SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.107.0"

RPM_NAME = "libKF5SyntaxHighlighting5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "6d3a000f21ccd3e2f9b3af088287f656511a66e3b03030ffe99451bbccba67d1aeb4aaeea98ecf40c34b80fac8aeb8f0dde9fb3c9c5bd5387dba3f238775b42a"

RPROVIDES:${PN} += "libKF5SyntaxHighlighting.so.5 \
libKF5SyntaxHighlighting5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
