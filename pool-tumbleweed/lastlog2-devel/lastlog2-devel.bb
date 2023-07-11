SUMMARY = "Development files for liblastlog2"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read, write or modify the lastlog2 database."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "lastlog2-devel-1.1.0-2.2.aarch64.rpm"
RPM_HASH = "fc356a87acf66aa408ad1ec45dc68263a6b8e6c600d34fb6ad3e9c95acdd3384bb7a6a625025de10fef23595578ead6d9aeca3357d4c0470317f16eb0c205803"

RPROVIDES:${PN} += "lastlog2-devel \
pkgconfig-liblastlog2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblastlog2-1"

inherit rpm
