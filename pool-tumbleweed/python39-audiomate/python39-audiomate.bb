SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-audiomate-6.0.0-4.3.noarch.rpm"
RPM_HASH = "f740a8f9af9a1524b7f8bb6c5404ba9a9205f545dea14f7d34361b25c45fa5189a712382c6e5128f548cb7d51ee494cada0daec636ab6582f9203187a99bd466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audiomate \
python39-audiomate \
python3dist-audiomate"

RDEPENDS:${PN} += "python-abi \
python39-PGet \
python39-audioread \
python39-h5py \
python39-intervaltree \
python39-librosa \
python39-networkx \
python39-numba \
python39-numpy \
python39-requests \
python39-scipy \
python39-sox"

inherit rpm
