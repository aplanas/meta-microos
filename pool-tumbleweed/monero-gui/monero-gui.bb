SUMMARY = "The official GUI app for the Monero cryptocurrency"
DESCRIPTION = "The official Qt-based GUI wallet app for the privacy-focused Monero cryptocurrency"
LICENSE = "BSD-3-Clause"

PV = "0.18.2.0"

RPM_NAME = "monero-gui-0.18.2.0-1.1.aarch64.rpm"
RPM_HASH = "9912ea0e8c5d30a65ec89dc98684f98a42242b539d40422344a3b987a80cd9529f8249b24b4992965a0d2e8529400568172b3290a9a2f27f7b6a6ee41de17c63"

RPROVIDES:${PN} += "application() \
application(monero-gui.desktop) \
monero-gui \
monero-gui(aarch-64)"

RDEPENDS:${PN} += "graphviz \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libboost_chrono.so.1.81.0()(64bit) \
libboost_filesystem.so.1.81.0()(64bit) \
libboost_program_options.so.1.81.0()(64bit) \
libboost_serialization.so.1.81.0()(64bit) \
libboost_thread.so.1.81.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libhidapi-libusb.so.0()(64bit) \
libm.so.6()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libunbound.so.8()(64bit) \
monero-utils \
monerod"

inherit rpm
