SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwallet-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "25091cc1a151745ca0fb2f0360837692533d6894340515108eb392dbc8fa16f534d311170179aedefe1f20c286346f178f1e2c82d8d6ebb0a2cb93a30faf6763"

RPROVIDES:${PN} += "cmake-KF5Wallet \
kwallet-devel \
kwallet-framework-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
extra-cmake-modules \
libKF5Wallet5 \
libkwalletbackend5-5"

inherit rpm
