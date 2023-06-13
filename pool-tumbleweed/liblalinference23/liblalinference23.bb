SUMMARY = "Shared library for LAL Inference"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Inference library."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "liblalinference23-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "aa2103918986d00f215a6a10c388d31dfa1f73b26e965a76b417123971c32e792d54c1943644e7a686d66c4b4e500b56951b80bab651b623d30382edaa3170d7"

RPROVIDES:${PN} += "liblalinference.so.23()(64bit) \
liblalinference23 \
liblalinference23(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalburst.so.6()(64bit) \
liblalframe.so.13()(64bit) \
liblalinspiral.so.17()(64bit) \
liblalmetaio.so.10()(64bit) \
liblalsimulation.so.31()(64bit) \
liblalsupport.so.14()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
