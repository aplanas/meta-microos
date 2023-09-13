SUMMARY = "C API for multipath-tools"
DESCRIPTION = "This library enables the use of libmultipath commands from C code."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.6+71+suse.f07325e"

RPM_NAME = "libdmmp0_2_0-0.9.6+71+suse.f07325e-1.1.aarch64.rpm"
RPM_HASH = "e149f8ef562deef09a0fa418f9fef1e49a231262f4a5ecb367b676bcd5d1c81056aa3754038e6afb85fc277eb41a1e227ddd41ca675c2cedeaca53898a594940"

RPROVIDES:${PN} += "libdmmp.so.0.2.0 \
libdmmp0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmpathcmd.so.0 \
multipath-tools"

inherit rpm
