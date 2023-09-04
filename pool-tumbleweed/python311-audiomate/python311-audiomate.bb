SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-audiomate-6.0.0-4.3.noarch.rpm"
RPM_HASH = "740b171650a6d77e470a064e950ef909203318a9a0cbcf92a52a34af409949300667cb5c777bf09e2b08925686fc6152dc839c1617247617a44116d6baf22350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiomate \
python3.11dist-audiomate \
python311-audiomate \
python3dist-audiomate"

RDEPENDS:${PN} += "python-abi \
python311-PGet \
python311-audioread \
python311-h5py \
python311-intervaltree \
python311-librosa \
python311-networkx \
python311-numba \
python311-numpy \
python311-requests \
python311-scipy \
python311-sox"

inherit rpm
