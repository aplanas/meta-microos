SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwallet-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d0851a98d0a717d1d1858f7732400ed161424912d0bf4576694df50299da2a0c69239a4cdf0ecaf4687016bab573d64e07321fb640bf10adcfa24e6492e714ab"

RPROVIDES:${PN} += "cmake-KF5Wallet \
kwallet-devel \
kwallet-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5Wallet5 \
libkwalletbackend5-5"

inherit rpm
