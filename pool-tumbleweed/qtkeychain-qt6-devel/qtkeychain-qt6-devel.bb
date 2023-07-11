SUMMARY = "Development files for libqt6keychain"
DESCRIPTION = "This package contains development files for using the Qt6 keychain API."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "qtkeychain-qt6-devel-0.13.2-4.2.aarch64.rpm"
RPM_HASH = "c6daedc291ab19085235da4868a6e4394024d434baeefd61b7426229c3f8abd404124ac125deabccabe6574b9f695fef078f8e62433e7fb510a013212330e448"

RPROVIDES:${PN} += "cmake-Qt6Keychain \
qtkeychain-qt6-devel"

RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
