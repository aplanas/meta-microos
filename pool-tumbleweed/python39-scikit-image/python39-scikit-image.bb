SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.19.3"

RPM_NAME = "python39-scikit-image-0.19.3-1.10.aarch64.rpm"
RPM_HASH = "e8098c1fa514cdc5e573466d091dcafd33646ba50699655e690e332b877f51384848b77d23f332cde7dfafe651e0ae13d34ade371107b8dc893bfb146813d57c"

RPROVIDES:${PN} += "python3.9dist-scikit-image \
python39-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
python-abi \
python39-Pillow \
python39-PyWavelets \
python39-imageio \
python39-networkx \
python39-numpy \
python39-packaging \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
