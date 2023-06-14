SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.2.2"

RPM_NAME = "python310-astropy-5.2.2-1.1.aarch64.rpm"
RPM_HASH = "a68518cbf343cda85f3f7f5cde1f2cdc38fde92775ec49ca9d1c857ab17f0d7ffac1de399dec989647cef59ec71448caa46de552a357504badc9a3c5f4f316c1"

RPROVIDES:${PN} += "python3-astropy \
python3.10dist-astropy \
python310-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.7 \
python-abi \
python310-PyYAML \
python310-dbm \
python310-numpy \
python310-packaging \
python310-pyerfa \
update-alternatives"

inherit rpm
