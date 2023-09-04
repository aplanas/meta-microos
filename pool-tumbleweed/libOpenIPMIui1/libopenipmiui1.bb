SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMIui1-2.0.31-5.14.aarch64.rpm"
RPM_HASH = "668cb2e4cffb4d440c73f9db4bc9d2b5a846066b3b90bcd1113f50acfadbe910a45b9b6a00344b62bdd8c52334be76e702245c7b72a028664968c7a846fde2ce"

RPROVIDES:${PN} += "libOpenIPMIui.so.1 \
libOpenIPMIui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
