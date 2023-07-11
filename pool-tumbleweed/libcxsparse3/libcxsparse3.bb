SUMMARY = "An extended version of CSparse"
DESCRIPTION = "CXSparse is an extended version of CSparse, with support for double \
or complex matrices, with int or long integers. \
 \
CXSparse is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libcxsparse3-3.2.0-49.2.aarch64.rpm"
RPM_HASH = "d42ac941adbbe0d5a0d1ca34e3ff90db56e186ddf6b1252a83e94d6f70e57cb6d097f5fefb4a9509888eb6fd43d28e1fc0454acc3545983afeb25ca08e802ceb"

RPROVIDES:${PN} += "libcxsparse-3-2-0 \
libcxsparse.so.3 \
libcxsparse3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
