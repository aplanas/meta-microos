SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python310-cmapfile-2022.9.29-1.6.noarch.rpm"
RPM_HASH = "b9784c5e58a91764291deec5525b21478e5fde791babae74e02963f8e2404e4ef9d17be9cb002424da3c0ff734469fc32803d852ba81b09fa14b143cee5c9ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cmapfile \
python310-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-h5py \
python310-numpy \
python310-oiffile \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
