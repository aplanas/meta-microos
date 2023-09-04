SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMI0-2.0.31-5.14.aarch64.rpm"
RPM_HASH = "79a61b296dc87adb1fa8705331ff5b82455e57be9770beb2f0f3c2e0b4c0ecdf65573816eb9ee6b1e3ad201ad247509e6381f43536da5f7a525293868f821540"

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
