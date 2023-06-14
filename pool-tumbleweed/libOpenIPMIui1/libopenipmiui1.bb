SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "libOpenIPMIui1-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "2e88d13d50686a267bdcf772c0713a1ad901df75b84f425c92dc3c2942259562560c5a8cd843dad8b93540f42671e811c92b8c5d4efad2e794fa83403645f2f8"

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
