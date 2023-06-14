SUMMARY = "Deepin Toolkit Core libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) is the base devlopment tool of all C++/Qt Developer work \
on Deepin."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.33"

RPM_NAME = "libdtkcore5-5.5.33-1.7.aarch64.rpm"
RPM_HASH = "d051596d43f081b5d66e77cec9d6990509cc1986707901aaa237124cac23d32deec78a6a708ad73d20b6f967a2798853dba07c57cc0ccae07746b4e6a2666c3c"

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
