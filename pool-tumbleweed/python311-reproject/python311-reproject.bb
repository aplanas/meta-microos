SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python311-reproject-0.9.1-1.5.aarch64.rpm"
RPM_HASH = "6bd6f7f8820377b4febc2e1b6eb81c3e8bb71d05adddc32817a77b9a907d48017df29ac06b32ac3f61daecf44fecf0bead5be071ed1a204f954f8ebfc055fc0b"

RPROVIDES:${PN} += "python3.11dist(reproject) \
python311-reproject \
python311-reproject(aarch-64) \
python3dist(reproject)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-astropy \
python311-astropy-healpix \
python311-numpy \
python311-scipy"

inherit rpm
