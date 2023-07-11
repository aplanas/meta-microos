SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-reproject-0.9.1-1.7.aarch64.rpm"
RPM_HASH = "1a285ccb82792b1c250432edb5a7f167bc1dfca99fb71e6729a238a9c5723ad4618a2d746d6f91383fdf9a60f11ffb67a0bb19d34010a168cea03204bcb3226f"

RPROVIDES:${PN} += "python3.10dist-reproject \
python310-reproject \
python3dist-reproject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-astropy \
python310-astropy-healpix \
python310-numpy \
python310-scipy"

inherit rpm
