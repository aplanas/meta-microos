SUMMARY = "Lxqt-globalkeys libraries"
DESCRIPTION = "lxqt-globalkeys main system library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-globalkeys1-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "78aea5687c8f99256eb96a6032e2cf40c29f3422161d20fd6796b446025e219f850468b4919136beed9be5e894693a2f06eb19de907c1b475928378a4cdace22"

RPROVIDES:${PN} += "liblxqt-globalkeys.so.1 \
liblxqt-globalkeys1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
