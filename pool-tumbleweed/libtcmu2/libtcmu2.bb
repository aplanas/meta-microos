SUMMARY = "Runtime libraries for tcmu-runner"
DESCRIPTION = "This package contains the runtime libraries for tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "libtcmu2-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "a38628ed99b7d17963abbaa2e963910d9d4d63c63da7d9655148b961142657970a1414bbf14b4371f9c40047efb13aaded213f8d33d6f25021a725fdae0be2a9"

RPROVIDES:${PN} += "libtcmu.so.2()(64bit) \
libtcmu2 \
libtcmu2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-3.so.200(libnl_3_2_27)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libtcmalloc.so.4()(64bit)"

inherit rpm
