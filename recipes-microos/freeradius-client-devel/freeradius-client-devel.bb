SUMMARY = "Header files, libraries and development documentation for freeradius-client"
DESCRIPTION = "This package contains the header files, static libraries and \
development documentation for freeradius-client. You need to install \
freeradius-client-devel if you want to develop applications using \
freeradius-client."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-devel-1.1.7-1.30.aarch64.rpm"
RPM_HASH = "fb34688f5b807ad268572c2744924e78df282bba6b18a1e16ac491003c1107878fb5ff00d6c37b6777e7dcaa0a0127bcfe0de7bce74751a4cb7091a04f6ca2db"

RPROVIDES:${PN} += "freeradius-client-devel freeradius-client-devel(aarch-64)"
RDEPENDS:${PN} += "freeradius-client-libs glibc-devel"

inherit rpm
