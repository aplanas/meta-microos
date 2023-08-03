SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libobjc4-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "bf47d4e8f7120964b912f686c6e593acb174cee4f5347442d1cd02a41fc121ef1d88de2500ac71830577cbbf460fee6aba2360ec7b4fec7539a3b7a060f5b492"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
