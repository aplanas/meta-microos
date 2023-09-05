SUMMARY = "Data files for KDE Education Applications"
DESCRIPTION = "This package contains common data files used by various KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdeedu-data-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9dc3897ea01774f240336106b9d0c3e76e16dea6980ff9b5b9b029bb563e5ddae4f90b220d0c0c960fc58dd6a42f8394c99525c0401143b187baadaa3113dd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeedu-data \
libkdeedu4-data \
libkeduvocdocument-data"

RDEPENDS:${PN} += ""

inherit rpm
