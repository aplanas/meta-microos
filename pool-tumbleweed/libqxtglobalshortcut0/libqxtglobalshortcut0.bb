SUMMARY = "Library for handling system-wide shortcuts in Qt applications"
DESCRIPTION = "Library for handling system-wide shortcuts in Qt applications."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "libqxtglobalshortcut0-0.0.1+git1533120914.688715b-1.24.aarch64.rpm"
RPM_HASH = "88c8e27ba52ca02a5fedc2eba53b3c39a20bbd1b584c99ee0d27eacdd3dd4cc4e8ee6ec029e19c36412a750270fb1bffb6361c2fff006117ee91c62fe1fd5926"

RPROVIDES:${PN} += "libqxtglobalshortcut.so.0 \
libqxtglobalshortcut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
