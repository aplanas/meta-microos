SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-audiomate-6.0.0-4.2.noarch.rpm"
RPM_HASH = "6d4116b1321942b896af34b3aa089ef932e081925f989907985b5f62b43ae677241717ed3daef268609089f7562768c499c1eb2d328c886de830c6179bae7603"
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
