SUMMARY = "Development files for the Claw library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw-devel-1.7.4-4.11.aarch64.rpm"
RPM_HASH = "ed606dfb6279483a6801d4db18c9c34b2ee2100b7e9720b87c01482476ad3b1fb0a3280e2171441bdc81b2babce326d8ecdfdd434840dd31f8ebe5931c618b3c"

RPROVIDES:${PN} += "cmake-libclaw \
libclaw-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cmake \
libclaw1"

inherit rpm
