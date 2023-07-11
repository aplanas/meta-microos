SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.19.3"

RPM_NAME = "python310-scikit-image-0.19.3-1.10.aarch64.rpm"
RPM_HASH = "ca40e11dd6b94449879fea71b8987c8d74928b44c299f4ca5ba8f39c72928a0c7e36cf5b0de12b1a7b729568e45d89cc24d31e0743a68e3e89d0d5cbdfd1084f"

RPROVIDES:${PN} += "python3.10dist-scikit-image \
python310-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
python-abi \
python310-Pillow \
python310-PyWavelets \
python310-imageio \
python310-networkx \
python310-numpy \
python310-packaging \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
