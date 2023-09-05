SUMMARY = "Development package for incidenceeditor"
DESCRIPTION = "The development package for the incidenceeditor libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "incidenceeditor-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "21a2abee8bd3ad797ed3341bc6dd94cd5e0f732413fb5cfd9b702df2ae5682530733374e263a175988847176b7e345849dccd748468e3c4ff981722687d92a71"

RPROVIDES:${PN} += "cmake-KPim5IncidenceEditor \
incidenceeditor-devel"

RDEPENDS:${PN} += "cmake-KChart \
cmake-KF5CalendarCore \
cmake-KPim5CalendarSupport \
cmake-KPim5CalendarUtils \
cmake-KPim5EventViews \
cmake-KPim5MailTransport \
cmake-KPim5Mime \
libKPim5IncidenceEditor5"

inherit rpm
