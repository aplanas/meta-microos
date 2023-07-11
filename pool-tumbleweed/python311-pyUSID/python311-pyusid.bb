SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python311-pyUSID-0.0.10.post2-1.4.noarch.rpm"
RPM_HASH = "12f6727358ef217e63574948e743ba1b57c3576beb7b5dc6dc23bf91d59d85b4030bdfb6844770898d1c38951a8e08a0ca617589816660ae97315cc7fd5ad867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyUSID \
python3.11dist-pyusid \
python311-pyUSID \
python3dist-pyusid"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-cytoolz \
python311-dask \
python311-h5py \
python311-numpy \
python311-psutil \
python311-sidpy \
python311-toolz"

inherit rpm
