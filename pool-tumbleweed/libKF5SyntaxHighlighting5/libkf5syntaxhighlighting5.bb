SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "libKF5SyntaxHighlighting5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "bfd0380219f0c4ea7ad06552961fa9db8b518df2e11d1b306cafcf8074504515cfe65c90609a37f1220b15e2f83765c41e1826fc4151f4dc2c8f7a194cc1204d"

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
