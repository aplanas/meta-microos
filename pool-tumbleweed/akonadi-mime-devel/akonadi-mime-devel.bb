SUMMARY = "MIME email parser for KDE PIM - development files"
DESCRIPTION = "This package contains development headers needed to use MIME message parsing \
in KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-mime-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a83df3cd913b43b6b2543b27c820e55c9f1b08f025d62661cf643c2a841aa3ec576bb9826b567b37ef63abbb43b98aed3097c8029750f1fb80cac209cf45123e"

RPROVIDES:${PN} += "akonadi-mime-devel \
cmake-KF5AkonadiMime \
cmake-KPim5AkonadiMime"

RDEPENDS:${PN} += "cmake-KPim5Akonadi \
libKPim5AkonadiMime5"

inherit rpm
