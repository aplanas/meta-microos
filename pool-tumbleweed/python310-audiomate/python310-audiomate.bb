SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-audiomate-6.0.0-4.3.noarch.rpm"
RPM_HASH = "d6aeb54f926164d381ed783e8736187053f99c48a657785285fdda4afd46e810145e58333f6c8f23150d0e26e5eaa88e6171c71d77a760d237d1eee9183734eb"
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
