SUMMARY = "Build environment for akonadi-notes"
DESCRIPTION = "This package contains the development files needed to use the akonadi-notes \
library in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-notes-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5f127d65f0463f205987f5c6582591f204df3b54475895c9a12ef6b906a6b4c9cf3c024780fd09a49a1cfa86abe2185be669edfb485ce40a6e0632822fbd4037"

RPROVIDES:${PN} += "akonadi-notes-devel \
cmake-KF5AkonadiNotes \
cmake-KPim5AkonadiNotes"

RDEPENDS:${PN} += "cmake-KPim5Mime \
libKPim5AkonadiNotes5"

inherit rpm
