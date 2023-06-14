SUMMARY = "Provides direct access to plasma data engines"
DESCRIPTION = "Plasmaengineexplorer is a graphical tool allowing developers to \
test Plasma data engines without writing a Plasma applet."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "plasmaengineexplorer5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "75afe9880e331104eebab7cde1b86e8f5ab65107f822a8bc99f27dafda0c4c04173ab828e6995c1d6f53f8a85c941c70166d3d3445a4705b52eaa83366b1e675"

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
