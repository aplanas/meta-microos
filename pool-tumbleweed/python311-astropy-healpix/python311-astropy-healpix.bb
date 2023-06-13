SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python311-astropy-healpix-0.7-1.5.aarch64.rpm"
RPM_HASH = "59c48cc77155bfc9e43a9878b594adf2707154f53bb801023f269c5f0f97c4167c5ac9319baa1632712637f55e33cd6fd036a9d41ed7ccac1f9edecac0629a7a"

RPROVIDES:${PN} += "python3.11dist(astropy-healpix) \
python311-astropy-healpix \
python311-astropy-healpix(aarch-64) \
python311-astropy_healpix \
python3dist(astropy-healpix)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-astropy \
python311-numpy"

inherit rpm
