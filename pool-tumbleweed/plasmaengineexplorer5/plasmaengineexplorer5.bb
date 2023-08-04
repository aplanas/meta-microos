SUMMARY = "Provides direct access to plasma data engines"
DESCRIPTION = "Plasmaengineexplorer is a graphical tool allowing developers to \
test Plasma data engines without writing a Plasma applet."
LICENSE = "GPL-2.0-only"

PV = "5.27.7.1"

RPM_NAME = "plasmaengineexplorer5-5.27.7.1-1.1.aarch64.rpm"
RPM_HASH = "a3af3b568032b6b437b85601e54e4cf33e9ecb862fe0f8a38c4639349acd2b78ec9da2fb353ab42de4da829242aa3d679dc96782bfcd6b8ba8126b7f92a91e86"

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
