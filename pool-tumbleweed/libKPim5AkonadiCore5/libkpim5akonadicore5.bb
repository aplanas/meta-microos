SUMMARY = "Core Akonadi Server library"
DESCRIPTION = "This package includes the core Akonadi library, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiCore5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9f9aa8316a628662569341a6d26bd8ea845f386a99e71d5ea51355a00b05b4fe12ed971b482f7839b70ec5c8009116e8e289c8223e7a22bcd6e4a4ac855d78d9"

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
