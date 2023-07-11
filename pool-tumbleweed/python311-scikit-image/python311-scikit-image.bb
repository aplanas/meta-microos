SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.19.3"

RPM_NAME = "python311-scikit-image-0.19.3-1.10.aarch64.rpm"
RPM_HASH = "fb5feef266e6d32177e5e7f1978e2943ecf9af34ff94e00220d875433ec523981f4761d49dd8a86f33348951823f80f9bb5b5a94fcf469907bedc9dcbc35cb74"

RPROVIDES:${PN} += "python3-scikit-image \
python3.11dist-scikit-image \
python311-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
python-abi \
python311-Pillow \
python311-PyWavelets \
python311-imageio \
python311-networkx \
python311-numpy \
python311-packaging \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
