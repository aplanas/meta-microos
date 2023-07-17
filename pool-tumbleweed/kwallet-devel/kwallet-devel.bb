SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwallet-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b6ff631e8f18765fafd8b789fa84fd91cff7498ccc8143ea8a0cab2c074df27da665e22a83d238721b56f03d3d2011f24a20e1377928b0004e53241616436cc0"

RPROVIDES:${PN} += "cmake-KF5Wallet \
kwallet-devel \
kwallet-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5Wallet5 \
libkwalletbackend5-5"

inherit rpm
