SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.2"

RPM_NAME = "python39-astropy-5.3.2-1.1.aarch64.rpm"
RPM_HASH = "0d40f0ba22a6e39391501e69252931462e661f57e46d36597b608725e15f18959d351b00c0f27f0a7939891dbd61285c79481a5c6b6f8150174cca34065952ea"

RPROVIDES:${PN} += "python3.9dist-astropy \
python39-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.7 \
python-abi \
python39-PyYAML \
python39-numpy \
python39-packaging \
python39-pyerfa \
update-alternatives"

inherit rpm
