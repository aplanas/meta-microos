SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python39-cmapfile-2022.9.29-1.4.noarch.rpm"
RPM_HASH = "5c3200e49e76f46c1601446f02274648d51744996812950c93d9729906886e24a10b4cab2858aed33426b8828b4d10c22bf6ffaa9fc6f189091285cb7c7b4991"
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
