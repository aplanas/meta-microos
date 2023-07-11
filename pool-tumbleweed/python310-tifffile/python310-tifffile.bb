SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python310-tifffile-2023.4.12-1.3.noarch.rpm"
RPM_HASH = "fa8a1d1244381538eb03eec3f4b5fae5cf9678363f2a264a8c14785444338a56c73ff17455f8987b9cd5585ead0c2ec0eed4b28f4fe787f57a553bb3eb188f3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tifffile \
python310-tifffile \
python3dist-tifffile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
