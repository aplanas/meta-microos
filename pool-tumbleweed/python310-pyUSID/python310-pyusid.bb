SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python310-pyUSID-0.0.10.post2-1.2.noarch.rpm"
RPM_HASH = "85c8137d17a7f12785f92022ea0982c3b41534ff6d32ce72c234d110a08d179a55d1bd0f87d755ba4b37ce4fae87143e1330362498b0f5bb81c6e67dba74ea09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyUSID \
python3.10dist(pyusid) \
python310-pyUSID \
python3dist(pyusid)"

RDEPENDS:${PN} += "python(abi) \
python310-Pillow \
python310-cytoolz \
python310-dask \
python310-h5py \
python310-numpy \
python310-psutil \
python310-sidpy \
python310-toolz"

inherit rpm
