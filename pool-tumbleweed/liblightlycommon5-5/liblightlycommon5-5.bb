SUMMARY = "Lightly support code"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic. \
 \
This package contains the support code of Lightly."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "liblightlycommon5-5-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "1b718521980034c31498725fe55beff7df4c89b19831f015d5e67e8d0eee62b26ac94ddb586290116e1a81f963020ca6cf786b246efadd94b2b8484b479b4c36"

RPROVIDES:${PN} += "liblightlycommon5-5 \
liblightlycommon5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
