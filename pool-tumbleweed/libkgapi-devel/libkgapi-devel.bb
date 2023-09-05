SUMMARY = "Build environment for libkgapi"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkgapi-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9621c20f7c40509d14328528f1e97419ca2ca72dec510cbe1507927ff2b10c952feae8deb97115b7e1efc26b4a47988fd824961448f83e3450c0eb11a6288aa5"

RPROVIDES:${PN} += "cmake-KPim5GAPI \
cmake-KPimGAPI \
libkgapi-devel \
libkgapi5-devel"

RDEPENDS:${PN} += "cmake-KF5CalendarCore \
cmake-KF5Contacts \
libKPim5GAPIBlogger5 \
libKPim5GAPICalendar5 \
libKPim5GAPICore5 \
libKPim5GAPIDrive5 \
libKPim5GAPILatitude5 \
libKPim5GAPIMaps5 \
libKPim5GAPIPeople5 \
libKPim5GAPITasks5"

inherit rpm
