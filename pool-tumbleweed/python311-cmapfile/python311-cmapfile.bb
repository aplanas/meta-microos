SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python311-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "719a8bf3907573287afe0da195ba0271ee50a46682a7411953d8cf86e87085c120f7f83b302cce764519f68e03c9c3f7eb347133a42a1c7ad0d85600e8caad7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmapfile \
python3.11dist-cmapfile \
python311-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-h5py \
python311-numpy \
python311-oiffile \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
