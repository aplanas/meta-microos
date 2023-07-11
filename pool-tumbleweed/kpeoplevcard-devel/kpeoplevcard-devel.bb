SUMMARY = "Development files for kpeoplevcard, a vCard plugin for KPeople"
DESCRIPTION = "Development files for kpeoplevcard, a datasource plugin for KPeople that reads \
vCard files from the local filesystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "kpeoplevcard-devel-0.1-1.16.aarch64.rpm"
RPM_HASH = "ce632e01fa5a545b7bd558639a85490b13a63f9b494bec67530ce0d2ea86034154a2cee5fe66bca2c4ef3295fc09c4d566f29cf38382750ee198425a3d2c1708"

RPROVIDES:${PN} += "cmake-KF5PeopleVCard \
kpeoplevcard-devel"

RDEPENDS:${PN} += ""

inherit rpm
