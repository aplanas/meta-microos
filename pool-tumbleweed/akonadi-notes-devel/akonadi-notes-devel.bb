SUMMARY = "Build environment for akonadi-notes"
DESCRIPTION = "This package contains the development files needed to use the akonadi-notes \
library in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-notes-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "33d23226211693259766255b5aef31e4366dea7bc200e292ba655a190752f0c52ae3616b19df01ec052cce6de578212b1293f4dad2b75be9d8e1a8edd67e39be"

RPROVIDES:${PN} += "akonadi-notes-devel \
cmake-KF5AkonadiNotes \
cmake-KPim5AkonadiNotes"

RDEPENDS:${PN} += "cmake-KPim5Mime \
libKPim5AkonadiNotes5"

inherit rpm
