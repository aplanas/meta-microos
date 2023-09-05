SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-contact-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c7c714f4b3bc70ec67a8c6bbb07e7997ddc10a361515a2437c63fa343aa6be8c7b617ed38e4538e765bec2e8b5e8cc0eb58154c9b10121982443f74335a1ad1c"

RPROVIDES:${PN} += "akonadi-contact-devel \
akonadi-contacts-devel \
cmake-KF5ContactEditor \
cmake-KPim5AkonadiContact \
cmake-KPim5ContactEditor"

RDEPENDS:${PN} += "akonadi-contact \
cmake-Grantlee5 \
cmake-KF5Contacts \
cmake-KPim5Akonadi \
cmake-KPim5GrantleeTheme \
cmake-Qt5Widgets \
libKPim5AkonadiContact5 \
libKPim5ContactEditor5"

inherit rpm
