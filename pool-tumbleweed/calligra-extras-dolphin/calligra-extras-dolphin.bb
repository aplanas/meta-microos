SUMMARY = "Diverse plugins for Dolphin"
DESCRIPTION = "Plugin for the Dolphin file properties dialog, displaying the \
metadata of files in the ODF formats and a plugin adding a 'Print' \
action for several formats to the filemanager context menu and \
calling the related Calligra programs."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-dolphin-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "8cbe1f3dd0e1619e6a1c50fd15a7168344042b5b435eebffd0aa668715484f2697ee1cd45b69bad6c362ea1ee6cd722905071835a2b42b95181719bbb7cd9c6e"

RPROVIDES:${PN} += "calligra-extras-dolphin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libkowidgets.so.17 \
libstdc++.so.6"

inherit rpm
