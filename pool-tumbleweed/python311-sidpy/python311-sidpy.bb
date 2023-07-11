SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python311-sidpy-0.11.2-2.4.noarch.rpm"
RPM_HASH = "69c0d8f7ed52bfcf61e4338e0bfdb72bdef7b0abde0a59b50b06d590f471d485753eb2bb4165d19a3289fb3e99b83aa510e017fabdd6b1726165ada21a2c8312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sidpy \
python3.11dist-sidpy \
python311-sidpy \
python3dist-sidpy"

RDEPENDS:${PN} += "python-abi \
python311-ase \
python311-cytoolz \
python311-dask \
python311-dask-array \
python311-distributed \
python311-h5py \
python311-ipython \
python311-ipywidgets \
python311-joblib \
python311-matplotlib \
python311-numpy \
python311-psutil \
python311-scikit-learn \
python311-scipy \
python311-toolz"

inherit rpm
