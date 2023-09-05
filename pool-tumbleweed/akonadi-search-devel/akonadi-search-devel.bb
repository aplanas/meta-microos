SUMMARY = "Development package for baloo5"
DESCRIPTION = "Development files for the AkonadiSearch library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "akonadi-search-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7a6630f51f16555eb72edf9cb8b80bc20d74d9b4715b5de2f8f61843a0952e74963b18babd17ed07593dd21482a9db2494efccec7ee2471b53cfd8c188768e7a"

RPROVIDES:${PN} += "akonadi-search-devel \
cmake-KPim5AkonadiSearch"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5Contacts \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5Mime \
cmake-Qt5Core \
libKPim5AkonadiSearch5"

inherit rpm
