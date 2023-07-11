SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-audiomate-6.0.0-4.2.noarch.rpm"
RPM_HASH = "d783edbb7c6b58c50e88ecc49da94d489aa4f00fbbf59e5f11047df669de39d2541a28e44364e18ab7a7951cf9f801810337386ecc1e138f919aeba6a935913b"
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
