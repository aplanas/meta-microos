SUMMARY = "Akonadi Xml library"
DESCRIPTION = "This package includes the Akonadi Xml library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiXml5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "dff9f62e350c05d3bfa405f9fcaf74054b3f136a13e48ee558cda63266623c34eb1aa111b83821861a1b0efd989febca20719c5977a231517d372882bdfe75f8"

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
