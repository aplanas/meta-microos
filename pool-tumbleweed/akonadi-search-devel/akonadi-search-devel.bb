SUMMARY = "Development package for baloo5"
DESCRIPTION = "Development files for the AkonadiSearch library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "akonadi-search-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "95eac702ba3b08c65b4d7661dca6c90e27b4b6245c6ea901dae66ae714c0b15c5f804e90505e34076c832fb2f68400ef6616d023cdfe2f8892e97c0b0a068530"

RPROVIDES:${PN} += "akonadi-search-devel \
cmake-KF5AkonadiSearch \
cmake-KPim5AkonadiSearch"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5Contacts \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5Mime \
cmake-Qt5Core \
libKPim5AkonadiSearch5"

inherit rpm
