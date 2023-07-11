SUMMARY = "A pump.io client written in C++/Qt"
DESCRIPTION = "Pumpa is a pump.io client written in C++ and Qt."
LICENSE = "GPL-3.0+"

PV = "0.9.3"

RPM_NAME = "pumpa-0.9.3-2.33.aarch64.rpm"
RPM_HASH = "0b7b6c5e9b1fd468e6b2a0cb6c485e0cce977333b0fe24df3e7a20d4164351d554e74218b288e7d27c65f9bd4ba24430952dd6f7e7e135607f26226e7f8c0127"

RPROVIDES:${PN} += "pumpa"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtidy.so.58"

inherit rpm
