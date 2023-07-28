SUMMARY = "Diverse plugins for Dolphin"
DESCRIPTION = "Plugin for the Dolphin file properties dialog, displaying the \
metadata of files in the ODF formats and a plugin adding a 'Print' \
action for several formats to the filemanager context menu and \
calling the related Calligra programs."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-dolphin-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "be09e1983cd4ad891e8c4d3f7a37231484fe5ab3e374d4cbb6e65ed458695e815ed7624f1fa3979d0c49f9bce90d4067483588b39c0b52505bf15fd433855ccd"

RPROVIDES:${PN} += "calligra-extras-dolphin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libkowidgets.so.17 \
libstdc++.so.6"

inherit rpm
