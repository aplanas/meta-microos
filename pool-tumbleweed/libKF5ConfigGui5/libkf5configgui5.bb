SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ConfigGui5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3dd7ec483ca9a14738a3504ab3308250111544e6213c0c28781b364aaa3c7b0b426be5162b89922dc7316a8bfc9682a9b0793091ec0d7f7150bbda20a77dba9f"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5 \
libKF5ConfigGui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
