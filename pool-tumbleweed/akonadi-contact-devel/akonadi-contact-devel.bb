SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-contact-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fc0352edcb95da6f3d7df571492f38b1bc4ac2c242caeb3734811dcc066969f1c3a9d5c2a52198ec0eda78becda4a2b3d1ae2b26678339f4841403bbe7d726db"

RPROVIDES:${PN} += "akonadi-contact-devel \
akonadi-contacts-devel \
cmake-KF5AkonadiContact \
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
