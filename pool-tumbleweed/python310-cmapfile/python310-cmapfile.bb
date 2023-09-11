SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python310-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "6a31e612ae648df4c50207f3bb0b2dd38cde9a36ab2b9491e8a8363bcfbe2bef3f38aafed32c69927e603824b8483c6b7f1a697bbe1ef9ec305f4eaab1dfb303"
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
