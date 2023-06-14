SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMI0-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "612ddb2c105cb980a44f0490668d59f6f9f06e53f7ff741a7496fdb025e57b13e9b44eb7a3c56e91e2af423d0658c3acb61e68542692602c868313d4e1443f89"

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
