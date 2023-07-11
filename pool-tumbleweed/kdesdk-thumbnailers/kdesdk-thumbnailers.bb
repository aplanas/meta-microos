SUMMARY = "Translation file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of po files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdesdk-thumbnailers-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3c13589de9577c16db9acb47cb7e6afa53fcee635a08a70cafc43731240cb51e2d9b0ff52cdc99dfdf71378382ecc937384b95f12dff242d9f48db1159aa13aa"

RPROVIDES:${PN} += "kdesdk-thumbnailers"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgettextpo.so.0 \
libstdc++.so.6"

inherit rpm
