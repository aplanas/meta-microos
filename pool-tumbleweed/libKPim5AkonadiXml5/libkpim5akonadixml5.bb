SUMMARY = "Akonadi Xml library"
DESCRIPTION = "This package includes the Akonadi Xml library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiXml5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1786ac4fc974ad4b748f07806387e5fd48afc02ddbaaaedf98a66060461b418e71efb55db28b44c0e7365ec190b9e00599824bc9970712b476c5dd91dfeb2ea1"

RPROVIDES:${PN} += "libKPim5AkonadiXml.so.5 \
libKPim5AkonadiXml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
