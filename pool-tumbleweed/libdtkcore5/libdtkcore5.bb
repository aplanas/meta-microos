SUMMARY = "Deepin Toolkit Core libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer work \
on Deepin."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "libdtkcore5-5.5.33-1.9.aarch64.rpm"
RPM_HASH = "30b0620cff4a74ebc39aa5919341cb5d3e071a0e149c9ffd8976397cf1fade1100ce45a55a0a6fc8de0ccb7d78c9bf2989b52b365e0aaaa117972ab0e6992ea7"

RPROVIDES:${PN} += "libdtkcore.so.5 \
libdtkcore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
deepin-desktop-base \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libstdc++.so.6"

inherit rpm
