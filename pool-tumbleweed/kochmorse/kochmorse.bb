SUMMARY = "A simple morse tutor using the Koch method"
DESCRIPTION = "A simple morse tutor using the Koch method."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "kochmorse-3.5.1-1.4.aarch64.rpm"
RPM_HASH = "1288ba6eb572ffa48ebca79aef0b0015f294542373c15050b47ba8a2e6a353c8ce1831f08f4057312f2089b99ebafc7536442f2313e8f9b0cf8c00388b30e73b"

RPROVIDES:${PN} += "kochmorse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
