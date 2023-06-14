SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwallet-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "92502a99ca58b24c1fff9fb0547ec1c045c61a6baa238a4cf4c6165698897672a27b2449953889c4fcd9d13ebb5d7b3a5f648bbe18c5cb447a93c22c3212b8dc"

RPROVIDES:${PN} += "cmake-KF5Wallet \
kwallet-devel \
kwallet-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5Wallet5 \
libkwalletbackend5-5"

inherit rpm
