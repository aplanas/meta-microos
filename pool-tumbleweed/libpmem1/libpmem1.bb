SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "2784103c4bb1b334fab5a44fdcf4ee18db91bec9601a455e2d469d4ec4d9b14ed0ffd6fd4265d3f73e193b0d164b4c2cac7f1be758846255a96896d7e27ce5fb"

RPROVIDES:${PN} += "libpmem.so.1 \
libpmem1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6"

inherit rpm
