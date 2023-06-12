SUMMARY = "Include Files and Libraries for the TCP wrapper library"
DESCRIPTION = "This package contains the library and header files, which are necessary \
to compile and link programs against the TCP wrapper library."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-devel-7.6-895.3.aarch64.rpm"
RPM_HASH = "9d8138706fd9b718c5d9f479fb8e41a74cd4c207c35ffc0ad72fdbbcb7f293fe63ee9dbf46d629b9d89094de9d2662ad6d3cc8a8e59c1a59b3dbd9dd7805e192"

RPROVIDES:${PN} += "tcpd-devel \
tcpd-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libwrap0"

inherit rpm
