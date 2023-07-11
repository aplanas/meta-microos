SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python310-astropy-healpix-0.7-1.7.aarch64.rpm"
RPM_HASH = "66d28a9a6cbc58debd6b2f645133ff23764dc0d8b08add78ff29ce795ef07b3e84f8aa52130914727d5a172fb459cd0cc98c74be620403251718bdc3cc59071f"

RPROVIDES:${PN} += "python3.10dist-astropy-healpix \
python310-astropy-healpix \
python3dist-astropy-healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-astropy \
python310-numpy"

inherit rpm
