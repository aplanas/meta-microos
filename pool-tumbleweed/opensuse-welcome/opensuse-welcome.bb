SUMMARY = "Welcome utility for openSUSE"
DESCRIPTION = "A welcome utility built to welcome new users to openSUSE."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.9+git.35.4b9444a"

RPM_NAME = "opensuse-welcome-0.1.9+git.35.4b9444a-1.1.aarch64.rpm"
RPM_HASH = "10ea0964c15db1612e8cf4e639f50aad7156f58bd0ea382e69f5ce4212f636b0550a0f7a66e20fd0d7a3521e6dcdfa4514f349bfe8815e554fca71d3c6dc1845"

RPROVIDES:${PN} += "opensuse-welcome"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
