SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.7.18"

RPM_NAME = "python311-tifffile-2023.7.18-1.1.noarch.rpm"
RPM_HASH = "7328083a87fa1994b2983afe0cbc2e5491b968d11e0ebde78161fd2b50a3e12f2091247fde2cfdd9c72137e94528454f9bec55ec62a6e49c8029c48ba0fdb643"
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
