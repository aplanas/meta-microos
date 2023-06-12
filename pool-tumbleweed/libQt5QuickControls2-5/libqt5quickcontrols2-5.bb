SUMMARY = "Qt 5 QuickControl2 Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5QuickControls2-5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "dee5c6b87de87d07515ced9495f1902865a40ee42c88a0c09b635a634f420f349b88a2593235c4d160e98ee50eab1db3cedaeb34c6102b082fc0db51dbdec98f"

RPROVIDES:${PN} += "libQt5QuickControls2-5 \
libQt5QuickControls2-5(aarch-64) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5(Qt_5.0)(64bit) \
libQt5QuickControls2.so.5(Qt_5.1)(64bit) \
libQt5QuickControls2.so.5(Qt_5.10)(64bit) \
libQt5QuickControls2.so.5(Qt_5.11)(64bit) \
libQt5QuickControls2.so.5(Qt_5.12)(64bit) \
libQt5QuickControls2.so.5(Qt_5.13)(64bit) \
libQt5QuickControls2.so.5(Qt_5.14)(64bit) \
libQt5QuickControls2.so.5(Qt_5.15)(64bit) \
libQt5QuickControls2.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickControls2.so.5(Qt_5.2)(64bit) \
libQt5QuickControls2.so.5(Qt_5.3)(64bit) \
libQt5QuickControls2.so.5(Qt_5.4)(64bit) \
libQt5QuickControls2.so.5(Qt_5.5)(64bit) \
libQt5QuickControls2.so.5(Qt_5.6)(64bit) \
libQt5QuickControls2.so.5(Qt_5.7)(64bit) \
libQt5QuickControls2.so.5(Qt_5.8)(64bit) \
libQt5QuickControls2.so.5(Qt_5.9)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickTemplates2.so.5()(64bit) \
libQt5QuickTemplates2.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
