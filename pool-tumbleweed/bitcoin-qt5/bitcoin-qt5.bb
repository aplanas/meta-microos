SUMMARY = "An end-user Qt5 GUI for the Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides Bitcoin-Qt, a GUI for Bitcoin based on \
Qt."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "bitcoin-qt5-25.0-1.1.aarch64.rpm"
RPM_HASH = "8760f39d36204c5afc7909d982ab0bed25a3b0ee8de50b5bd47e541b360b1dcb03a13dd414f82040076e9f718852850209ea3449dcf27e2917305409460e17f9"

RPROVIDES:${PN} += "bitcoin-qt5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdb-cxx-4.8.so \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.17 \
libqrencode.so.4 \
libstdc++.so.6 \
libzmq.so.5 \
update-desktop-files"

inherit rpm
