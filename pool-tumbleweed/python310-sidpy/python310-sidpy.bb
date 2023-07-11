SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python310-sidpy-0.11.2-2.4.noarch.rpm"
RPM_HASH = "603b8c671143d1cd030cd2fbe16a259228063e485fdbe2260a77d1d0b64aff753a80121090f515d634b1aecb8df39d034ed1ea7925e4d66432ac064572b8bf79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sidpy \
python310-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python310-ase \
python310-cytoolz \
python310-dask \
python310-dask-array \
python310-distributed \
python310-h5py \
python310-ipython \
python310-ipywidgets \
python310-joblib \
python310-matplotlib \
python310-numpy \
python310-psutil \
python310-scikit-learn \
python310-scipy \
python310-toolz"

inherit rpm
