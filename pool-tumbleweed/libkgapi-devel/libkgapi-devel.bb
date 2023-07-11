SUMMARY = "Build environment for libkgapi"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkgapi-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c2242b681d7d2cbfb8c3f258d973dbbb1ff4ee26f25fc7d37732f34719b554dc9c3a7d166c27988dbc9cb9994fd8ad787ac007630fc1c38e4fb09c58b8d10c31"

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
