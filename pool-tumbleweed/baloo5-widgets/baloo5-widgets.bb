SUMMARY = "Framework for searching and managing metadata"
DESCRIPTION = "Baloo is a framework for searching and managing metada"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "baloo5-widgets-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c0d145e9936d415418668b6c755e5d374e6fe98d5cfee91cd09f0a0eac5fbf018fd42d75f9eb81304388ca0d3463a9665feba37bd54d73ac36ab27718ee21d94"

RPROVIDES:${PN} += "baloo5-widgets \
libKF5BalooNaturalQueryParser1 \
libKF5BalooWidgets.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
