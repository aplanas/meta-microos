SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMI0-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "612ddb2c105cb980a44f0490668d59f6f9f06e53f7ff741a7496fdb025e57b13e9b44eb7a3c56e91e2af423d0658c3acb61e68542692602c868313d4e1443f89"

RPROVIDES:${PN} += "libIPMIlanserv.so.0()(64bit) \
libOpenIPMI.so.0()(64bit) \
libOpenIPMI0 \
libOpenIPMI0(aarch-64) \
libOpenIPMIcmdlang.so.0()(64bit) \
libOpenIPMIglib.so.0()(64bit) \
libOpenIPMIposix.so.0()(64bit) \
libOpenIPMIpthread.so.0()(64bit) \
libOpenIPMIutils.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgdbm.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
