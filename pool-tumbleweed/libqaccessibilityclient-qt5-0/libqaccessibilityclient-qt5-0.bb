SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers. \
It comes with some examples demonstrating the API. These small helpers may be \
useful when testing accessibility. One of them writes all accessibiliy \
interfaces an application provides as text output. The other, more advanced \
application shows a tree of objects and allows some interaction and \
exploration."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libqaccessibilityclient-qt5-0-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "625f193fc3d939702ba5f9c21581c58549348e8897049f7938dd1c1703d9951310a8f8ed456f6a479ffb1c3a2d843e3b753758da26035f76773cad3dc8cbb606"

RPROVIDES:${PN} += "libqaccessibilityclient-qt5-0 \
libqaccessibilityclient-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
