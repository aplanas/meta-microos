SUMMARY = "Core Akonadi Server library"
DESCRIPTION = "This package includes the core Akonadi library, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiCore5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "56920b0074c61dd64f71e0798b3f4adbe035d7f0dffc7617be88c3b3cc4703c9ee18f9425a243d50470a1343f9e4d80d7e69fbfabdf44cedaf68190ebc5891b1"

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
