SUMMARY = "Development files for tins"
DESCRIPTION = "This package contains header files, and libraries needed to develop \
application that use libtins."
LICENSE = "BSD-2-Clause"

PV = "4.4"

RPM_NAME = "libtins-devel-4.4-2.1.aarch64.rpm"
RPM_HASH = "b2ecc3bd260a141ea545fd69042928e0fb236b41a8eb4467716f8b64956eec67c8e73cdc2850a899f71bd0f49a577a8d6ce0632b76c9babffe87bacbd1dc6368"

RPROVIDES:${PN} += "cmake-libtins \
libtins-devel \
pkgconfig-libtins"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel \
libtins4-4"

inherit rpm
