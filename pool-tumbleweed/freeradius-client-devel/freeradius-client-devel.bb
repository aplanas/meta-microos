SUMMARY = "Header files, libraries and development documentation for freeradius-client"
DESCRIPTION = "This package contains the header files, static libraries and \
development documentation for freeradius-client. You need to install \
freeradius-client-devel if you want to develop applications using \
freeradius-client."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-devel-1.1.7-1.31.aarch64.rpm"
RPM_HASH = "03d132407c46052a220eca4858baa22077016e05f43df5e1b708599b57c64831e6af9b657d25382df358f1a165e648017a223fb4295c12a0db7af391bd586ea7"

RPROVIDES:${PN} += "freeradius-client-devel"

RDEPENDS:${PN} += "freeradius-client-libs \
glibc-devel"

inherit rpm
