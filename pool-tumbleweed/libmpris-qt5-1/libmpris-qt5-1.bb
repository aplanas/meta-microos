SUMMARY = "Qtmpris libraries"
DESCRIPTION = "This package contains the libraries for qtmpris"
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "libmpris-qt5-1-1.0.6-2.8.aarch64.rpm"
RPM_HASH = "40f20efe484059155bdf88744352081d20fc660284f4d7b4944b0d6eed062ed626c0336528081a67eb37de3fd07c75eaa9535581b7e527928a9bd6b5e0829920"

RPROVIDES:${PN} += "libmpris-qt5-1 \
libmpris-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
