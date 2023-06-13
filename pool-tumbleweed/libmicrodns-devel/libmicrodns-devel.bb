SUMMARY = "Development files for libmicrodns"
DESCRIPTION = "The libmicrodns-devel package contains libraries and header files for \
developing applications that use libmicrodns."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0+6"

RPM_NAME = "libmicrodns-devel-0.2.0+6-2.2.aarch64.rpm"
RPM_HASH = "8def85a309741f081f44ee77c6957941d5a2801d0fa4d769869b96f21ce316ad8f25244dcb4ccf611af5441f58de365341b48551f024e19b8bfbfe7ea74f23a0"

RPROVIDES:${PN} += "libmicrodns-devel \
libmicrodns-devel(aarch-64) \
pkgconfig(microdns)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmicrodns1"

inherit rpm
