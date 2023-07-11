SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers. \
It comes with some examples demonstrating the API. These small helpers may be \
useful when testing accessibility. One of them writes all accessibiliy \
interfaces an application provides as text output. The other, more advanced \
application shows a tree of objects and allows some interaction and \
exploration."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libqaccessibilityclient-qt5-devel-0.4.1-1.12.aarch64.rpm"
RPM_HASH = "98e78d3e5d655dd768aece99e6423990426c0ca5858e74115d76558828d99604860840ba75ad4cfd2784c8bb2a166b8a21e75a78d26c9c3066fff8eb4867cea7"

RPROVIDES:${PN} += "cmake-QAccessibilityClient \
libqaccessibilityclient-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqaccessibilityclient-qt5-0 \
libqaccessibilityclient-qt5.so.0 \
libstdc++.so.6"

inherit rpm
