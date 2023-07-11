SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-audiomate-6.0.0-4.2.noarch.rpm"
RPM_HASH = "ddaee5ea95a2e8d0d5d1fa656cf462b2bd8ce6db8952b0f4016c2b66020a2e380a70c2ca491142eeadc6a1e08bbd69e72fde7efffdc8f737656e5f2d505a42de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-audiomate \
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
