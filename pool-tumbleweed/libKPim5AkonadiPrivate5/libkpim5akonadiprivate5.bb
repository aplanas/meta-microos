SUMMARY = "Akonadi Private Server library"
DESCRIPTION = "This package includes the Private Akonadi library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiPrivate5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f75679842548024c6ea69672b77b56c3cbe8bc929d2f6499f5b5028283846b7aba1cf0d2a4d885c5588c39700013d6a727a8d22fd7d08fa2e2c8c8457d5338c7"

RPROVIDES:${PN} += "libKPim5AkonadiPrivate.so.5 \
libKPim5AkonadiPrivate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6"

inherit rpm
