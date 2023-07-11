SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python39-cmapfile-2022.9.29-1.6.noarch.rpm"
RPM_HASH = "0f26cb81167d6890263affcead866d435457f923d0205701770e2da3c76bddee50aea0a6c64518b070031be70a6c6006a94b223472bc0cac4af6941aa570ad46"
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
