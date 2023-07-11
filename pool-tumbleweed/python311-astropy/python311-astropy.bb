SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3"

RPM_NAME = "python311-astropy-5.3-1.1.aarch64.rpm"
RPM_HASH = "19d8b1fca8cb4330339fc428bf2bb7fc54111819da97a7d0b9b4a66454c978abcadcde4bff15f6e48753d7c2a26f5982a467d74dfc99e8301eb4cf0a5369cb89"

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
python311-dbm \
python311-numpy \
python311-packaging \
python311-pyerfa \
update-alternatives"

inherit rpm
