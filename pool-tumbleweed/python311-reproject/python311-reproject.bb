SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-reproject-0.9.1-1.7.aarch64.rpm"
RPM_HASH = "bfdae20e4d1e2110d69a0141c1e21545833865fda28d51cf360546a01d9b73ec4003cd0bc5f36cf858f6fa05b2f43b8bae1d5c40fca4b61586ee72269cd70159"

RPROVIDES:${PN} += "python3-reproject \
python3.11dist-reproject \
python311-reproject \
python3dist-reproject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-astropy \
python311-astropy-healpix \
python311-numpy \
python311-scipy"

inherit rpm
