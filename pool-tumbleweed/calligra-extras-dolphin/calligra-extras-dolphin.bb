SUMMARY = "Diverse plugins for Dolphin"
DESCRIPTION = "Plugin for the Dolphin file properties dialog, displaying the \
metadata of files in the ODF formats and a plugin adding a 'Print' \
action for several formats to the filemanager context menu and \
calling the related Calligra programs."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-dolphin-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "09ea9f040e2dcd4b74295959ba3b6c25dadbfee05fe927bd86d588782506f2a37b144be9748e40052642c09722395239ecb492b7aff5bd9a465980b7156c7ba3"

RPROVIDES:${PN} += "calligra-extras-dolphin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libkowidgets.so.17 \
libstdc++.so.6"

inherit rpm
