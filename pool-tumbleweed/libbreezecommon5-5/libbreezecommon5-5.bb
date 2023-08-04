SUMMARY = "Library containing support code for the Breeze Qt5 style"
DESCRIPTION = "Library containing support code for the Breeze Qt5 style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libbreezecommon5-5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "44eb00a743f70bbd3d2ea46c92fc97d13ab5187eef2570dd3a892f8dd8dd016244cf992347593e77157f219ad5b226cd19931f75adf6b396ec774a3d4f736591"

RPROVIDES:${PN} += "libbreezecommon5-5 \
libbreezecommon5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
