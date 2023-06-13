SUMMARY = "Plugin for the Qt6 Interface designer"
DESCRIPTION = "The qwt6-qt6-designer package contains the plugin for the Qt5 User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-designer-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "ccc94bf0cc2d076edea91306a8c94d022ea4f8216fb0b105f6957fa311800cd584014591af571bad21a89de8fe78e5e509a83cc39520e7d486b8cd5a646688f9"

RPROVIDES:${PN} += "libqwt_designer_plugin.so()(64bit) \
qwt6-qt6-designer \
qwt6-qt6-designer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libqwt-qt6.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
qwt6-qt6-devel"

inherit rpm
