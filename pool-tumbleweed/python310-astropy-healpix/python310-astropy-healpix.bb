SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-astropy-healpix-0.7-1.5.aarch64.rpm"
RPM_HASH = "f8759f1c70434a1a4f267e7e4d8a6e3aebb6e4fdf53860dd703adad736c03047de4125e82b00f1ca47fc5096b3342f5a71079ccc535271709e504710e0153d0f"

RPROVIDES:${PN} += "python3-astropy-healpix \
python3-astropy_healpix \
python3.10dist(astropy-healpix) \
python310-astropy-healpix \
python310-astropy-healpix(aarch-64) \
python310-astropy_healpix \
python3dist(astropy-healpix)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python310-astropy \
python310-numpy"

inherit rpm
