SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3"

RPM_NAME = "python310-astropy-5.3-1.1.aarch64.rpm"
RPM_HASH = "dde0836176b1321134087e349e8404d9ae4be15d282b357019656f363f31b740c0b0e29d47f687822827307951a6d48b40ec27b0c690de6b059fb7654f733a6b"

RPROVIDES:${PN} += "python3.10dist-astropy \
python310-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
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
