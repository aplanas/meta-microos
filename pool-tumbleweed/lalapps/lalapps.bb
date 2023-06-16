SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "lalapps-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "2703be9fa31b1c7258cf7dfac4326aa013f9ad2cfa41eb372bf4d46b88dfd7074c7edb315786e6d5390f11f324901d562db8846dca48054a7d416995bd9645d2"

RPROVIDES:${PN} += "config-lalapps \
lalapps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libframel.so.8 \
libgsl.so.25 \
liblal.so.20 \
liblalburst.so.6 \
liblalframe.so.13 \
liblalinference.so.23 \
liblalinspiral.so.17 \
liblalmetaio.so.10 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
libm.so.6 \
python3-lalapps"

inherit rpm
