SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python39-pyUSID-0.0.10.post2-1.2.noarch.rpm"
RPM_HASH = "da15632de465c5c2bd6638f67177b3afc1c128348d59d030acfb8ea5b2a6d884094ed287d9b6d9453da3c0e4b9b12af9d808d0f5d52741dbef066558568c3298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyusid) \
python39-pyUSID \
python3dist(pyusid)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-cytoolz \
python39-dask \
python39-h5py \
python39-numpy \
python39-psutil \
python39-sidpy \
python39-toolz"

inherit rpm
