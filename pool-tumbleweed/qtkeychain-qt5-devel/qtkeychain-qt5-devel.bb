SUMMARY = "Development files for the qtkeychain library"
DESCRIPTION = "qtkeychain can be used to store passwords. \
 \
This package contains development files for libqtkeychain."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "qtkeychain-qt5-devel-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "d8996ef25398d52cc34d7b184c5b8d91c1e84796a2604384a5b0c190282f89fdc84f1bd353dea80853cb7e83f8dad14e4988fb4335e77137d757cbfd0857c11b"

RPROVIDES:${PN} += "cmake-Qt5Keychain \
qtkeychain-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
libqt5keychain1"

inherit rpm
