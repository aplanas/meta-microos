SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python311-scikit-image-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "a54bdbd4acce9b05914c3b5e92044f8efc9e0e16e7cba2e32422bb7f278db41025d20d591f9ea7da02c9a1ba53a7db22ae20e1fe5c5c4887e53a6e74d343fcfe"

RPROVIDES:${PN} += "python3-scikit-image \
python3.11dist-scikit-image \
python311-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-Pillow \
python311-PyWavelets \
python311-imageio \
python311-lazy-loader \
python311-networkx \
python311-numpy \
python311-packaging \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
