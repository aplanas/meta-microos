SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.21.0"

RPM_NAME = "python310-scikit-image-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "e842da2ad0ab2aea6036a377c53b3167b9785239b6b02008da3f48bb676a399e5e68cdab42c2f419ce420062da6544306cf2b0a485954de5013d6e3e259340e2"

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
