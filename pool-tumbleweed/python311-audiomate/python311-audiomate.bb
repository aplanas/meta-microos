SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-audiomate-6.0.0-4.1.noarch.rpm"
RPM_HASH = "2c652c32c65eafdc88f6120919d28469b746094cc17889f68cd06cfee6ea66e46f2a21ea14fcf61e10da1fd6d0e778df0b311c25c67981fb7bfdd4aa10b13a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-audiomate \
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
