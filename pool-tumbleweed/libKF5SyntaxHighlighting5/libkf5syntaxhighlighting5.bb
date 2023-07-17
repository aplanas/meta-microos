SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.108.0"

RPM_NAME = "libKF5SyntaxHighlighting5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "fb7410062dc0a8dc99a3f94fe9cfc3b7e143d385b983b1a7b9cbe360bbdda25c272280cc6ac541669e8a97d7a368d4786ad0f99a4fabd9e70b11b61e0c312216"

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
