SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-audiomate-6.0.0-4.1.noarch.rpm"
RPM_HASH = "21cf4560e0c8ba5ac51627a8c99ab346b11ac22bf5bffffbca439f25d0db25ae34264d8868d879e1f977160c04bd6538a34cbfc000f735b73b04722ddf721c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiomate \
python3.10dist-audiomate \
python310-audiomate \
python3dist-audiomate"

RDEPENDS:${PN} += "python-abi \
python310-PGet \
python310-audioread \
python310-h5py \
python310-intervaltree \
python310-librosa \
python310-networkx \
python310-numba \
python310-numpy \
python310-requests \
python310-scipy \
python310-sox"

inherit rpm
