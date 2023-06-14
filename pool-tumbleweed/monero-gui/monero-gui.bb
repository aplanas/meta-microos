SUMMARY = "The official GUI app for the Monero cryptocurrency"
DESCRIPTION = "The official Qt-based GUI wallet app for the privacy-focused Monero cryptocurrency"
LICENSE = "BSD-3-Clause"

PV = "0.18.2.0"

RPM_NAME = "monero-gui-0.18.2.0-1.1.aarch64.rpm"
RPM_HASH = "9912ea0e8c5d30a65ec89dc98684f98a42242b539d40422344a3b987a80cd9529f8249b24b4992965a0d2e8529400568172b3290a9a2f27f7b6a6ee41de17c63"

RPROVIDES:${PN} += "monero-gui"

RDEPENDS:${PN} += "graphviz \
gtk3-tools \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libboost-chrono.so.1.81.0 \
libboost-filesystem.so.1.81.0 \
libboost-program-options.so.1.81.0 \
libboost-serialization.so.1.81.0 \
libboost-thread.so.1.81.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libhidapi-libusb.so.0 \
libm.so.6 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libunbound.so.8 \
monero-utils \
monerod"

inherit rpm
