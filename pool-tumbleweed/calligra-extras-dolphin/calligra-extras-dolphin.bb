SUMMARY = "Diverse plugins for Dolphin"
DESCRIPTION = "Plugin for the Dolphin file properties dialog, displaying the \
metadata of files in the ODF formats and a plugin adding a 'Print' \
action for several formats to the filemanager context menu and \
calling the related Calligra programs."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-dolphin-3.2.1-7.21.aarch64.rpm"
RPM_HASH = "420c694661f88b1cbc5175f1c7ee9576e7f5fade501492a7078e9954cc1e8e315e083f9cb9846aac71f5fff26568ec8f54a03a591138e497ed1e608b86a70b67"

RPROVIDES:${PN} += "calligra-extras-dolphin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libkowidgets.so.17 \
libstdc++.so.6"

inherit rpm
