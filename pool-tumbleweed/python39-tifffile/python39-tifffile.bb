SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python39-tifffile-2023.4.12-1.3.noarch.rpm"
RPM_HASH = "08360ee03c5ff907521bb22ee91e59b75a58f3bae810885b1969d845fdab5022a04741f877eb638f0ab054854fadc5c98a1e584068fa7cf7291d6d80fdc5ff1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tifffile \
python39-tifffile \
python3dist-tifffile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
