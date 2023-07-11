SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers. \
It comes with some examples demonstrating the API. These small helpers may be \
useful when testing accessibility. One of them writes all accessibiliy \
interfaces an application provides as text output. The other, more advanced \
application shows a tree of objects and allows some interaction and \
exploration."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libqaccessibilityclient-qt5-0-0.4.1-1.12.aarch64.rpm"
RPM_HASH = "06d07ee8be17ea5b0ce10daeb757f876799985142b428206d4a38d0b403c27bfbe79e2bf495ea6404e6aee5ef4ba3781d0e45ed1900f7dfe3ad9805235306567"

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
