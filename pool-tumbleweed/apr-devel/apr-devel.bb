SUMMARY = "Development files for the Apache Portable Runtime (APR) library"
DESCRIPTION = "APR is Apache's Portable Runtime Library, designed to be a support \
library that provides a predictable and consistent interface to \
underlying platform-specific implementations. \
 \
This subpackage contains header files for developing applications \
that want to make use of APR."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "apr-devel-1.7.4-1.1.aarch64.rpm"
RPM_HASH = "0fef484fee45b131935972a0e468e23a5ec01daea4a2642b52e9a9424838d95cb6c7885a7c8de50951ef18103d24020eff2e067fff449e9dbc2a62c4ea609ece"

RPROVIDES:${PN} += "apr-devel \
apr-devel(aarch-64) \
libapr1-devel \
pkgconfig(apr-1)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/pkg-config \
libapr1-0"

inherit rpm
