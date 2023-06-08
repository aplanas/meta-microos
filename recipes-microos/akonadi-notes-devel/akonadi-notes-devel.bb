SUMMARY = "Build environment for akonadi-notes"
DESCRIPTION = "This package contains the development files needed to use the akonadi-notes \
library in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-notes-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "126acf98962286a4abf0b926b18f4c1c64d82267706b656a13f28cb92d84836d9a36acb453723ac94053305bff96ec838a18bb04335175c71f47bebde29969f2"

RPROVIDES:${PN} += "akonadi-notes-devel akonadi-notes-devel(aarch-64) cmake(KF5AkonadiNotes) cmake(KPim5AkonadiNotes)"
RDEPENDS:${PN} += "cmake(KPim5Mime) libKPim5AkonadiNotes5"

inherit rpm
