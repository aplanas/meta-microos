SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python311-astropy-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "59afaa34a2248fe049c3e7469fde4f6d1fe0e6c8e8da7f9201716924d9c0dd8caa08dce966df3b6579325c0c8cac36e0d9d906387a3c715003e09a724a2739f4"

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
