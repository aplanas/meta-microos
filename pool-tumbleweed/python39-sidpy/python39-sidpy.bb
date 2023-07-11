SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python39-sidpy-0.11.2-2.4.noarch.rpm"
RPM_HASH = "7184b9568d4e501d4cba8e0c1fb4584bfafa1c808e0d116a7974cb8d487061cb067aae00b3aa5f63c237ab5f66ef9b3ada837b6a23cf279e890b183626fa4485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sidpy \
python39-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python39-ase \
python39-cytoolz \
python39-dask \
python39-dask-array \
python39-distributed \
python39-h5py \
python39-ipython \
python39-ipywidgets \
python39-joblib \
python39-matplotlib \
python39-numpy \
python39-psutil \
python39-scikit-learn \
python39-scipy \
python39-toolz"

inherit rpm
