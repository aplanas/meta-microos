SUMMARY = "Core Akonadi Server library"
DESCRIPTION = "This package includes the core Akonadi library, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiCore5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9095d4e32e7ac002b24470252eb4f4f30e2febb202c3b7d24ac76a7100d75c8462bdda3158b6a0529e7b162e1464bce253dab3158a6a709f6ae3ce0d8a678667"

RPROVIDES:${PN} += "libKPim5AkonadiCore.so.5 \
libKPim5AkonadiCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5KIOCore.so.5 \
libKPim5AkonadiPrivate.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
