SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python310-cmapfile-2022.9.29-1.4.noarch.rpm"
RPM_HASH = "e574f4fb1a188f86bf3de714dab6457b9eacae427b83496259226062d3473f9e14122faa5965c70a022d55e50c2b2d46a0b29ff410c0b93da3762bd5d2ae862e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmapfile \
python3.10dist-cmapfile \
python310-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-h5py \
python310-numpy \
python310-oiffile \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
