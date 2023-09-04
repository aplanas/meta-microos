SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.2"

RPM_NAME = "python310-astropy-5.3.2-1.1.aarch64.rpm"
RPM_HASH = "7546cb4b31dd0b4976a3c25f1f038ecd6e993559fee0f8b5f4634269a613153f89612ac03a1d28b53b4c6c52882f3835720807305790f3cb2682095e61ec78ad"

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
python310-numpy \
python310-packaging \
python310-pyerfa \
update-alternatives"

inherit rpm
