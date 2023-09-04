SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.7.18"

RPM_NAME = "python39-tifffile-2023.7.18-1.1.noarch.rpm"
RPM_HASH = "5ce1f89c87d2bd9213d4579dad7f4d5699896ecf7db81d1e4453f47f0b97b72932a17babaebe0872ddc3f0ae373007e7f9d77ba0fadce8a9b89e27e5846a9dcc"
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
