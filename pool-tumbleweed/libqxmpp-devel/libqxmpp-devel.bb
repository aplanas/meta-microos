SUMMARY = "Qxmpp Development Files"
DESCRIPTION = "Development package for qxmpp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp-devel-1.5.3-1.4.aarch64.rpm"
RPM_HASH = "665a80a0a6ddccb19f67d326e139f822a758f49c35b545eb19b2d6951bae9f560c53ea0d60ff3ad121c8bcc2d149fd9a8b7b90f3160b2fd2f134c19f2ccbaddc"

RPROVIDES:${PN} += "cmake-QXmpp \
cmake-QXmppOmemo \
libqxmpp-devel \
libqxmpp-qt5-devel \
pkgconfig-qxmpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxmpp4 \
pkgconfig-gstreamer-1.0"

inherit rpm
