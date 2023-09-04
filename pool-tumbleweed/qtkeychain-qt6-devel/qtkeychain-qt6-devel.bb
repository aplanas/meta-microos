SUMMARY = "Development files for libqt6keychain"
DESCRIPTION = "This package contains development files for using the Qt6 keychain API."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "qtkeychain-qt6-devel-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "f42e2413aaaf52a2910227eca3ba342a324149434601461eb79ecc69b5f509e2c775aacefff09c4c326ec554784f1552e2b09dc87ac174639f08a56fb941f822"

RPROVIDES:${PN} += "cmake-Qt6Keychain \
qtkeychain-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6DBus \
libqt6keychain1"

inherit rpm
