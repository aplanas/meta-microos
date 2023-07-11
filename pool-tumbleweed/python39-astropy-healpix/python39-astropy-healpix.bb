SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-astropy-healpix-0.7-1.7.aarch64.rpm"
RPM_HASH = "04a91c54eff8bd1a104707bc07da08944e3c9f5c9c888bfc5c59ca9e56be6bf44d106d70f30846edc0e2c49fd39635953c21cc93b06406ed979b1d58e7099fed"

RPROVIDES:${PN} += "python3.9dist-astropy-healpix \
python39-astropy-healpix \
python3dist-astropy-healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-astropy \
python39-numpy"

inherit rpm
