SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgcc_s1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "3b7de9245a2dc2eabf346241156f1f4e5cae1ef3ba08271f741615774a03408ac36d2c145f382a7ea8e71f786a5e09cd58e2b1631eb2f777d0b7d220e995796b"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
