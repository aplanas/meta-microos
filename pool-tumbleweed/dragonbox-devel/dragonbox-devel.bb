SUMMARY = "Header files for dragonbox, a float-to-string conversion library"
DESCRIPTION = "This library is a reference implementation of Dragonbox in C++. \
 \
Dragonbox is a float-to-string conversion algorithm based on a beautiful \
algorithm Schubfach, developed by Raffaello Giulietti in 2017-2018. \
Dragonbox is further inspired by Grisu and Grisu-Exact. \
 \
This package contains the headers."
LICENSE = "Apache-2.0 | BSL-1.0"

PV = "1.1.3"

RPM_NAME = "dragonbox-devel-1.1.3-2.3.aarch64.rpm"
RPM_HASH = "88943fe3ad88e7c06cf72aaac20535897c679b10140e7df46911b6339ba7458c2b218bad4b38bd0944269ebdd9a3319e1522c0c0899df99207477f9b8bf8b723"

RPROVIDES:${PN} += "cmake(dragonbox) \
dragonbox-devel \
dragonbox-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
