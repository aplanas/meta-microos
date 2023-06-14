SUMMARY = "Akonadi Xml library"
DESCRIPTION = "This package includes the Akonadi Xml library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiXml5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e0f06906c0b1f1915a5b0739a894605fc556e23635e3b4eba23b1b38173ce47030b9bcc4f7bcb6a734af63f221be3072986fcc4c96a5f279fd9b0f159202e9ad"

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
