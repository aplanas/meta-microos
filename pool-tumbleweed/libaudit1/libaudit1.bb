SUMMARY = "Library for interfacing with the kernel audit subsystem"
DESCRIPTION = "The libaudit package contains the shared libraries needed for \
applications to use the audit framework."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "libaudit1-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "47565d6c5bd68c4469cd3174aaa46108fd54f82621660ba2c700b4e4b908bca42e2a8721a87670d8fb5324e7e4289851d088dba1190ec9fff023a60564873f03"

RPROVIDES:${PN} += "audit-libs \
config(libaudit1) \
libaudit.so.1()(64bit) \
libaudit1 \
libaudit1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
