SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python310-pyUSID-0.0.10.post2-1.4.noarch.rpm"
RPM_HASH = "c2b559029a3d0bd4d3ce5cd014069bb9b6499d49e54d2e2d99c4034fc50f598040e4701636b01950d2727495216f6269bf9b67866b9140417e2013be25f24d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyusid \
python310-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-cytoolz \
python310-dask \
python310-h5py \
python310-numpy \
python310-psutil \
python310-sidpy \
python310-toolz"

inherit rpm
