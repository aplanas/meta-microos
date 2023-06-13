SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.2.2"

RPM_NAME = "python311-astropy-5.2.2-1.1.aarch64.rpm"
RPM_HASH = "7362e3e2339f35a06ff65cc4040e2f20a40b97e2287d30f8cbda68577ca7f680f9fcfe32f94e5f6c4792ed576f8283467406c9e9adc4da0e4ff05f318a143026"

RPROVIDES:${PN} += "python3.11dist(astropy) \
python311-astropy \
python311-astropy(aarch-64) \
python3dist(astropy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcfitsio.so.10()(64bit) \
libexpat.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libwcs.so.7()(64bit) \
python(abi) \
python311-PyYAML \
python311-dbm \
python311-numpy \
python311-packaging \
python311-pyerfa \
update-alternatives"

inherit rpm
