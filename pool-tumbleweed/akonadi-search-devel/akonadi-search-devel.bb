SUMMARY = "Development package for baloo5"
DESCRIPTION = "Development files for the AkonadiSearch library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "akonadi-search-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "18e8c55a68acea1f7c3bfed27a5cccee722e3fc37a00eab81877d8f5f971484b5f4cbd764e6cdde3db349f75dae4c70ca72bbcc71aae27d2c69aa16539089223"

RPROVIDES:${PN} += "akonadi-search-devel \
akonadi-search-devel(aarch-64) \
cmake(KF5AkonadiSearch) \
cmake(KPim5AkonadiSearch)"

RDEPENDS:${PN} += "cmake(KF5CalendarCore) \
cmake(KF5Contacts) \
cmake(KPim5Akonadi) \
cmake(KPim5AkonadiMime) \
cmake(KPim5Mime) \
cmake(Qt5Core) \
libKPim5AkonadiSearch5"

inherit rpm
