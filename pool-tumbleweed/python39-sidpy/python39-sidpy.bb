SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python39-sidpy-0.11.2-2.2.noarch.rpm"
RPM_HASH = "7933af49441f340de4def66ef50eab72e4806e58772d30dbba183e227105f9869988d72f8cc16380a1633ca268dbedfae270d3a8450f421ecd288253bb5a1ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sidpy) \
python39-sidpy \
python3dist(sidpy)"
RDEPENDS:${PN} += "python(abi) \
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
