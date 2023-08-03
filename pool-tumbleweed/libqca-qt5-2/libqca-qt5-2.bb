SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "libqca-qt5-2-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "5169a8adc06e028c9896fbb0352ca163218c1f3b122ab6d3cc3b5fb778fddecbf8fe9d449a438dde3384b78856ca1d3ced6210c4a876f28e09c971d9affc8d45"

RPROVIDES:${PN} += "libqca-qt5 \
libqca-qt5-2 \
libqca-qt5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qca-qt5"

inherit rpm
