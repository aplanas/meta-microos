SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python39-astropy-healpix-0.7-1.5.aarch64.rpm"
RPM_HASH = "75f1ed3331151d3d12e187b7879966340336eb7c35aa42d1f92d83dd9cb7f7ce4157aab82a3505a5bec01fcd291ff90fe6c61a72dab078094aba4264fe65cd9c"

RPROVIDES:${PN} += "python3.9dist(astropy-healpix) \
python39-astropy-healpix \
python39-astropy-healpix(aarch-64) \
python39-astropy_healpix \
python3dist(astropy-healpix)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-astropy \
python39-numpy"

inherit rpm
