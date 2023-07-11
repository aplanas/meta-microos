SUMMARY = "development files for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
This package provides the devel files."
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-devel-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "330e5dbadbc6f817134c73c72b59ef57a66b9e1df24576a1756ef121e3c7f2ed118b67e8fa9717c28599809ed56bef41653589d91c8a7e1ed74f1e5362f3c642"

RPROVIDES:${PN} += "cmake-Powercap \
pkgconfig-powercap \
powercap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
powercap"

inherit rpm
