SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python310-astropy-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "104717570998f5ed22b0764e7e4d687b1fbc44d4ac1784884091de671d884196a7795fd188c3ff6ea5bb90d11ed50a42f8457419ebeadf71ff1ef5f32b7aeb86"

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
