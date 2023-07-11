SUMMARY = "Command line parsing library"
DESCRIPTION = "The libargtable2 package contains libraries for libargtable."
LICENSE = "LGPL-2.0+"

PV = "2.13"

RPM_NAME = "libargtable2-0-2.13-2.24.aarch64.rpm"
RPM_HASH = "1b938c77ed70ef5e65b5ae562bcb8fa52bed4a3cd5043c819358eb190d2bc839651393959a0db8931fb49599927b2f5d736d65157c0d6e1ab9d46e3c29878fd9"

RPROVIDES:${PN} += "libargtable2-0 \
libargtable2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
