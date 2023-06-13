SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python310-sidpy-0.11.2-2.2.noarch.rpm"
RPM_HASH = "9200106b9fd01ac09f242afbd78a5654f0de893c5647856ccf3d323636f8c5806dd55f8044ff9c26a9d9fc69ebc078e27018378062e42e140346c9d1d0404ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidpy \
python3.10dist(sidpy) \
python310-sidpy \
python3dist(sidpy)"

RDEPENDS:${PN} += "python(abi) \
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
