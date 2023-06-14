SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-contact-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "83e610676ce455eaef6dcb96436ea8ac93377444783dcf9e3e90b6d413f97ceb9d3b1f4513d9632350b1f6526c3e1ee476478f7f6de8c77609962047f9e8fb8d"

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
