SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "4efa89a6fa41bf4900c68f8e7c066a9f4173a0b28f391ed7aa772d82d291196c0c6c005836e8bce847596d1fa64579ee7bd0407a27abd148da72f60e00963625"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6 \
libQt6QuickDialogs2Utils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
