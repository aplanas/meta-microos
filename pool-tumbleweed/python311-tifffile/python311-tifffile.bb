SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python311-tifffile-2023.4.12-1.3.noarch.rpm"
RPM_HASH = "6ef046b0c2dbb462019b42d76c4668d2b2aa30063c6c317f54dbcd2e254f422d78a40604d8e1e978960f841f272a9871f9f13caccd7084c47c409627975d445f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tifffile \
python3.11dist-tifffile \
python311-tifffile \
python3dist-tifffile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
