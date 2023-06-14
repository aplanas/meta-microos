SUMMARY = "Network support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for network operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5Network0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "76fb93bb04e88affe56c834149b7c5f5e01f1175c8f120cdcb8513bc97eefe41e6c747ff3544e9b85bab0349b3de1e0e5e23a994fdfddd5ec95efa2211a0722b"

RPROVIDES:${PN} += "libQCoro5Network.so.0 \
libQCoro5Network0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQCoro5Core.so.0 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
