SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.109.0"

RPM_NAME = "libKF5SyntaxHighlighting5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0d474c13b390c52f1bb700dc5412f5fa1660cb445f634648b9544439fe7ac0e61ddcd2c2a1f1126b23789e314af7e1b2db4646feeaa3bb379a629ff01b2894fc"

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
