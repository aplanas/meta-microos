SUMMARY = "Development files of libchardet"
DESCRIPTION = "The libchardet development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libchardet."
LICENSE = "MPL-1.1"

PV = "1.0.6"

RPM_NAME = "libchardet-devel-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "446303ee2b94e7f35be4831aa7a8dda57c578867d8c8f550f0e5428eb20a340b7fca473187c12d7e675b29417b839d65120feb2bd21fcf229e86529d7e4ba47d"

RPROVIDES:${PN} += "libchardet-devel \
libchardet-devel(aarch-64) \
pkgconfig(chardet)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchardet1"

inherit rpm
