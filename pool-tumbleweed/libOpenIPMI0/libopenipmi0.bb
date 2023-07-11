SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMI0-2.0.31-5.13.aarch64.rpm"
RPM_HASH = "bc3b97d9e57c519399c25cfef4b278030864c2bffd989627ef471c61d8e0e7cdff80f60ef733e96505ab32679f5c59a94d6053b430fbe654c216aee15943f5d5"

RPROVIDES:${PN} += "libIPMIlanserv.so.0 \
libOpenIPMI.so.0 \
libOpenIPMI0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIpthread.so.0 \
libOpenIPMIutils.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgdbm.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
