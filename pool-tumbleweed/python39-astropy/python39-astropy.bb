SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "5.3"

RPM_NAME = "python39-astropy-5.3-1.1.aarch64.rpm"
RPM_HASH = "dac3eba87986da8a6a0b9c09ef017c221ba6e26b8fe42b9212dd449614398aa7c602cf480f2e5382f2602af94173a8008d5dd55892cd1cf95eafc18173949c74"

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
python39-dbm \
python39-numpy \
python39-packaging \
python39-pyerfa \
update-alternatives"

inherit rpm
