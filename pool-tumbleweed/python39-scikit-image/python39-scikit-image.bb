SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.19.3"

RPM_NAME = "python39-scikit-image-0.19.3-1.8.aarch64.rpm"
RPM_HASH = "1fbdcd7798a832e99a5aeb16269ba7257cc9d6694220b3d00953696eb08631b40d31cedc91980102cf3ba1f41aedebf50a0e05d46023072a6f7a220b2c2956f7"

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
