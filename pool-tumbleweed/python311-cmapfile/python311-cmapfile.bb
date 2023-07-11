SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python311-cmapfile-2022.9.29-1.6.noarch.rpm"
RPM_HASH = "46361d1953e61bf701a86da320c0397c7956583e91338992b6ad5665ecfa06de5c85ca89bc8d247725ff5b925ecad0f5aeb3389f3679807a70adce1ef412f55b"
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
