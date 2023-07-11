SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-astropy-healpix-0.7-1.7.aarch64.rpm"
RPM_HASH = "c1c62f7c6de737da011f9d1362d934034fef81fcb8ef4bfb03a8d3f8bd9c7158c7e3ee13cace6548d1695eb0b5c26e40ecfbc2526c364a33312f572f20ceb866"

RPROVIDES:${PN} += "python3-astropy-healpix \
python3.11dist-astropy-healpix \
python311-astropy-healpix \
python3dist-astropy-healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-astropy \
python311-numpy"

inherit rpm
