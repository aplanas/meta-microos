SUMMARY = "CDDB Access Library Utilities"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb-utils-1.3.2-27.1.aarch64.rpm"
RPM_HASH = "b1dc512c74d642df822b1a4724e001bc5f809269f9f561307cbc8510dc55193eddb8896345229132b9e1db84de526782960f5d06fced06387aacc006d3b60b65"

RPROVIDES:${PN} += "libcddb-utils \
libcddb-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcddb.so.2()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit)"

inherit rpm
