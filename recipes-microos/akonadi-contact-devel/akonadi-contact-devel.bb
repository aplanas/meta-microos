SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-contact-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "50df4848e2d75c371ac743f8a9bea01ba070b2d352699c5573978f847682ea7cd958a8acba90d3ec236ed685071d210a3db60b9d3533bb5f571307902121e124"

RPROVIDES:${PN} += "akonadi-contact-devel akonadi-contact-devel(aarch-64) akonadi-contacts-devel cmake(KF5AkonadiContact) cmake(KF5ContactEditor) cmake(KPim5AkonadiContact) cmake(KPim5ContactEditor)"
RDEPENDS:${PN} += "akonadi-contact cmake(Grantlee5) cmake(KF5Contacts) cmake(KPim5Akonadi) cmake(KPim5GrantleeTheme) cmake(Qt5Widgets) libKPim5AkonadiContact5 libKPim5ContactEditor5"

inherit rpm
