SUMMARY = "C API for multipath-tools"
DESCRIPTION = "This library enables the use of libmultipath commands from C code."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libdmmp0_2_0-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "4631fb95ad45c453900bfff1c93b455c0087b1fb7a9ab81db86a3db3b29de5f8b6bb7db68834f3e4aeb0fc7cfa4257f1411b10445205408b4f927ec7fc81f829"

RPROVIDES:${PN} += "libdmmp.so.0.2.0()(64bit) \
libdmmp0_2_0 \
libdmmp0_2_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjson-c.so.5()(64bit) \
libmpathcmd.so.0()(64bit) \
multipath-tools"

inherit rpm
