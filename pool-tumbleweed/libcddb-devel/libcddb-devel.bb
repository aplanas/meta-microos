SUMMARY = "CDDB Access Library"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb-devel-1.3.2-27.1.aarch64.rpm"
RPM_HASH = "ce7c68616122d7d740aabbe1978fcfdc861cb512d335a094786849670f1ca5212e21a14e4f36148f1e51fcfc32987e5ed7f10c5526b1fff6c778c8f2920f06a4"

RPROVIDES:${PN} += "libcddb-devel \
libcddb-devel(aarch-64) \
pkgconfig(libcddb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcddb2"

inherit rpm
