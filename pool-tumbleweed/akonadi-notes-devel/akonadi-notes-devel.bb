SUMMARY = "Build environment for akonadi-notes"
DESCRIPTION = "This package contains the development files needed to use the akonadi-notes \
library in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-notes-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ce86667057f614c334a05706aecdaa68b7216694f2ba3f87c9f80c8b6af255d5ae5666a0e790fc27ceae0a895d9916c1fc9abbd56d27b2d93ca3041962e8e78b"

RPROVIDES:${PN} += "akonadi-notes-devel \
cmake-KF5AkonadiNotes \
cmake-KPim5AkonadiNotes"

RDEPENDS:${PN} += "cmake-KPim5Mime \
libKPim5AkonadiNotes5"

inherit rpm
