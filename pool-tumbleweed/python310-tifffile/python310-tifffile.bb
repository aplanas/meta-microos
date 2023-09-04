SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.7.18"

RPM_NAME = "python310-tifffile-2023.7.18-1.1.noarch.rpm"
RPM_HASH = "f9354929d05561c08c716f3745d3d0fb997efa49d92dcd74c5e71242e378a53b23596f5a5924200f0a9aeac2cf46f69220f7f2ae176cfce2772a9bb3df931627"
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
