SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python310-scikit-image-0.21.0-2.1.aarch64.rpm"
RPM_HASH = "0fb19f977ab9f1fed5cbda46c0bfa60fcc1629b098196cedd1c3055c6391a364f0ebd4fc20c3b2d2e4e26ca43f1f05d8d5f7d61aaadc615634ee6a86201714f6"

RPROVIDES:${PN} += "python3.10dist-scikit-image \
python310-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-Pillow \
python310-PyWavelets \
python310-imageio \
python310-lazy-loader \
python310-networkx \
python310-numpy \
python310-packaging \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
