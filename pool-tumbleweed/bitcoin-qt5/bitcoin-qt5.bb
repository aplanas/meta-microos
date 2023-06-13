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

RPROVIDES:${PN} += "application() \
application(bitcoin-qt.desktop) \
bitcoin-qt5 \
bitcoin-qt5(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdb_cxx-4.8.so()(64bit) \
libevent-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libminiupnpc.so.17()(64bit) \
libqrencode.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libzmq.so.5()(64bit) \
update-desktop-files"

inherit rpm
