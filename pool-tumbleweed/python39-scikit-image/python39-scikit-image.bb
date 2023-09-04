SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python39-scikit-image-0.21.0-2.1.aarch64.rpm"
RPM_HASH = "42f9987ce10f52e72b8639e2f5ce7cc9657edb3a89361e2aee598d7dcc281ea029c933c56dba803ec3190e74dbd9d6b260954c2ea15241a545920921e252398c"

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
