SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python39-pyUSID-0.0.10.post2-1.4.noarch.rpm"
RPM_HASH = "3f8dbd12add19f822aad94de42baacb8c0f5af1852fea93b02ddc59ce4f451557908206673a89bdf4a0ef4c9befaa251dfd5308970f2c8706ba51133e8131e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyusid \
python39-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-cytoolz \
python39-dask \
python39-h5py \
python39-numpy \
python39-psutil \
python39-sidpy \
python39-toolz"

inherit rpm
