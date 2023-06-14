SUMMARY = "Shared library for LAL Inference"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Inference library."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "liblalinference23-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "aa2103918986d00f215a6a10c388d31dfa1f73b26e965a76b417123971c32e792d54c1943644e7a686d66c4b4e500b56951b80bab651b623d30382edaa3170d7"

RPROVIDES:${PN} += "liblalinference.so.23 \
liblalinference23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalburst.so.6 \
liblalframe.so.13 \
liblalinspiral.so.17 \
liblalmetaio.so.10 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
