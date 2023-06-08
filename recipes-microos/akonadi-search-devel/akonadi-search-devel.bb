SUMMARY = "Development package for baloo5"
DESCRIPTION = "Development files for the AkonadiSearch library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "akonadi-search-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "05a686bfc8bbd3238cf42502bbe29e76fa0f6d849face173701f7f0e5109839bc0a11daad5c6f284a4e932cb2138089bab7a874c5a873e895b3dfe7e8a783d25"

RPROVIDES:${PN} += "akonadi-search-devel akonadi-search-devel(aarch-64) cmake(KF5AkonadiSearch) cmake(KPim5AkonadiSearch)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) cmake(KF5Contacts) cmake(KPim5Akonadi) cmake(KPim5AkonadiMime) cmake(KPim5Mime) cmake(Qt5Core) libKPim5AkonadiSearch5"

inherit rpm
