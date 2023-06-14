SUMMARY = "Shared library for LAL Pulsar"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Pulsar library."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "liblalpulsar26-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "c11558051c55f788822074bf765c5402256040749bed0f890035010764d1fcb6abbdf30d96ec73e3180554761a0eb61fe52f86ba6f45151540e4bef88827d109"

RPROVIDES:${PN} += "liblalpulsar.so.26 \
liblalpulsar26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgsl.so.25 \
liblal.so.20 \
liblalframe.so.13 \
liblalinference.so.23 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
