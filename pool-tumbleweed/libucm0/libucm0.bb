SUMMARY = "Memory (un)happing hooks for Unified Communication X"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucm0-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "065124242873e9acd18e26d6a503ab2888a7c615502f4a16a09f0102e57ec75e41912e7e258768af2ba4ba328ecafd176c262b6dae80df38daf426af70e4fee7"

RPROVIDES:${PN} += "libucm.so.0 \
libucm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
