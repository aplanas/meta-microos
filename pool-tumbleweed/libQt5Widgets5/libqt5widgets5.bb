SUMMARY = "Qt 5 Widgets Library"
DESCRIPTION = "The Qt Widgets Module provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Widgets5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "d04427bc6262f7fb0185f4874510410653dbffabf5d2e3fd60c155b00934dfefd271c7ebd37a475dd7b88c84e95cb40bcf7e56d9fe8877493f7ce20258c892c7"

RPROVIDES:${PN} += "libQt5Widgets.so.5 \
libQt5Widgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
