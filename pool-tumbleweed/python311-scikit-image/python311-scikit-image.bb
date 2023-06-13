SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.19.3"

RPM_NAME = "python311-scikit-image-0.19.3-1.8.aarch64.rpm"
RPM_HASH = "b4ad4974def3242a3290342cac9c0c6253c20a37802bda55f0ada54a80eaf68460ca6fcfe488ec14f22d4e7a10a1058c8a4356dc4b86251e0eee61bdf14b78d3"

RPROVIDES:${PN} += "python3.11dist(scikit-image) \
python311-scikit-image \
python311-scikit-image(aarch-64) \
python3dist(scikit-image)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
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
