SUMMARY = "Akonadi Private Server library"
DESCRIPTION = "This package includes the Private Akonadi library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiPrivate5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "541c8018f18c42862f9e40970e3de7469534a7f95d930d74766b8bcd95c8d6b9041dfaf91195220f54e1c4743758515b81f13d57adb83d66a1e66a03f17dba5c"

RPROVIDES:${PN} += "libKPim5AkonadiPrivate.so.5()(64bit) \
libKPim5AkonadiPrivate5 \
libKPim5AkonadiPrivate5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblzma.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
