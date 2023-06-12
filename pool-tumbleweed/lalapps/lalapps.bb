SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "lalapps-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "2703be9fa31b1c7258cf7dfac4326aa013f9ad2cfa41eb372bf4d46b88dfd7074c7edb315786e6d5390f11f324901d562db8846dca48054a7d416995bd9645d2"

RPROVIDES:${PN} += "config(lalapps) \
lalapps \
lalapps(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libframel.so.8()(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalburst.so.6()(64bit) \
liblalframe.so.13()(64bit) \
liblalinference.so.23()(64bit) \
liblalinspiral.so.17()(64bit) \
liblalmetaio.so.10()(64bit) \
liblalsimulation.so.31()(64bit) \
liblalsupport.so.14()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
python3-lalapps"

inherit rpm
