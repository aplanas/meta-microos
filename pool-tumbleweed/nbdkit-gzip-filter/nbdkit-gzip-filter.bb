SUMMARY = "GZip filter for nbdkit"
DESCRIPTION = "This package is a gzip filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-gzip-filter-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "eedf0ccc2a2a2d3f052fd3f9906c95d36141512f18fe3c49058c3c9e6c4766558b39b9f43c1ef5f0e4f4f278c9fb7906ef02c1fba9de6f85fd47322b6c61aa4a"

RPROVIDES:${PN} += "nbdkit-gzip-filter \
nbdkit-gzip-filter(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
nbdkit-server"

inherit rpm
