SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2023.8.30"

RPM_NAME = "python39-cmapfile-2023.8.30-1.1.noarch.rpm"
RPM_HASH = "3f261e86721a0fb79caa80f4fd74964cb938b8e3433e5ce952e826339221586951fd54df67f9a2adacda6b7cadbdf677cf9c01000cacf54c87caa2ea3a7fda92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cmapfile \
python39-cmapfile \
python3dist-cmapfile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-h5py \
python39-numpy \
python39-oiffile \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
