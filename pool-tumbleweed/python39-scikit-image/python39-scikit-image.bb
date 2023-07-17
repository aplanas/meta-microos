SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python39-scikit-image-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "2245350098d7fe26407ab0df0de4da655923d88bd2a53e69dd9cd6ebb29eb43482a407f7dfee39286d5dd3bedeb5b9be499a4f92f684b9f923c90b19e27a3cbb"

RPROVIDES:${PN} += "python3.9dist-scikit-image \
python39-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-Pillow \
python39-PyWavelets \
python39-imageio \
python39-lazy-loader \
python39-networkx \
python39-numpy \
python39-packaging \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
