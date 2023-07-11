SUMMARY = "Adwaita Qt6 theme"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt6-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "72b02c500e6b846069778e104a5512cdfbd33268629a6aac0a41cece55ae041d9f71204f8f50ea4cf51f3f022f98b70929ca89c4f65bad91cdacf51cd58b9484"

RPROVIDES:${PN} += "adwaita-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libadwaitaqt6-1 \
libadwaitaqt6.so.1 \
libadwaitaqt6priv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
