SUMMARY = "Development package for KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Development package for kpmcore."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "kpmcore-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "92fa759ea5bb0bc4115739ad33e24164fbde4f056a380699dbc7cac8a84fa80d6ea15c345585ae7ee61d59332f14c035696cf2481def0c329692842dfbf7122d"

RPROVIDES:${PN} += "cmake-KPMcore \
kpmcore-devel"

RDEPENDS:${PN} += "libkpmcore12"

inherit rpm
