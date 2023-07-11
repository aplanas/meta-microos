SUMMARY = "Provides direct access to plasma data engines"
DESCRIPTION = "Plasmaengineexplorer is a graphical tool allowing developers to \
test Plasma data engines without writing a Plasma applet."
LICENSE = "GPL-2.0-only"

PV = "5.27.6"

RPM_NAME = "plasmaengineexplorer5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "0cf051183f5c41cea5f7b01a493523523c7e0371b0b382285afae6064c169e5d7cd24a3404f3e94e0fc7432450b4c8916bb71557bd43c5887218a75b5e30c44f"

RPROVIDES:${PN} += "plasmaengineexplorer5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Plasma.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
