SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "python311-yt-4.1.4-1.5.aarch64.rpm"
RPM_HASH = "720c2bb6995fefbae22f38d62086ffa06435ca27eb1f973f603f5ef7ed037d6e80a935a2958339007e1d561602ef4d5615632e1ef5ce9de9a48066807a777882"

RPROVIDES:${PN} += "python3.11dist-yt \
python311-yt \
python3dist-yt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-ipython \
python311-matplotlib \
python311-more-itertools \
python311-numpy \
python311-setuptools \
python311-sympy \
python311-toml \
python311-tqdm \
python311-unyt \
update-alternatives"

inherit rpm
