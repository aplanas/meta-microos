SUMMARY = "Development package for incidenceeditor"
DESCRIPTION = "The development package for the incidenceeditor libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "incidenceeditor-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fe15211618a9fd47aef7469682150da5111d65a11ce0b6d140a01608eae542e0f7ddd79a517ac06cd2848c00240892762dbaf9a367c2b460b1a5f2f549853c7e"

RPROVIDES:${PN} += "cmake-KF5IncidenceEditor \
cmake-KPim5IncidenceEditor \
incidenceeditor-devel"

RDEPENDS:${PN} += "cmake-KChart \
cmake-KF5CalendarCore \
cmake-KPim5CalendarSupport \
cmake-KPim5CalendarUtils \
cmake-KPim5EventViews \
cmake-KPim5MailTransportAkonadi \
cmake-KPim5Mime \
libKPim5IncidenceEditor5"

inherit rpm
