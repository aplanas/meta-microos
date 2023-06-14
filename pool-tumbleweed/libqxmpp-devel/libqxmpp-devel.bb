SUMMARY = "Qxmpp Development Files"
DESCRIPTION = "Development package for qxmpp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp-devel-1.5.3-1.3.aarch64.rpm"
RPM_HASH = "6cf007ba04a2b609baafbdee46db0ca32d4d52e4e2f09b90706cebf45a745e804d7bc25fa175f49eeaa16659c4948b39bdcda0a7799ff0d07ffb0ea2ad798315"

RPROVIDES:${PN} += "cmake-QXmpp \
cmake-QXmppOmemo \
libqxmpp-devel \
libqxmpp-qt5-devel \
pkgconfig-qxmpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxmpp4 \
pkgconfig-gstreamer-1.0"

inherit rpm
