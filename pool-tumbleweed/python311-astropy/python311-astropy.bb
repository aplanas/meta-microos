SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.2"

RPM_NAME = "python311-astropy-5.3.2-1.1.aarch64.rpm"
RPM_HASH = "5393138a10c49dcb14ea658fe2a6b374f831b551b5a16eba2b9949e925a7fe429465739b26516cd82c6fa4d381c0c2384673234b45cba50a9aacf47127b48584"

RPROVIDES:${PN} += "python3-astropy \
python3.11dist-astropy \
python311-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.7 \
python-abi \
python311-PyYAML \
python311-numpy \
python311-packaging \
python311-pyerfa \
update-alternatives"

inherit rpm
