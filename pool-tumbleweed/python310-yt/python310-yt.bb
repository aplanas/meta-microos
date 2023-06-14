SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "python310-yt-4.1.4-1.5.aarch64.rpm"
RPM_HASH = "9c870af37e44694a53ab6ceccb8ba25b9135628f83e47af358b32c22353322265d1a3a8f12bb6deba72d0064918e2d9fc8c3110f7ca8339b3b6220132dd04dd9"

RPROVIDES:${PN} += "python3-yt \
python3.10dist-yt \
python310-yt \
python3dist-yt"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-ipython \
python310-matplotlib \
python310-more-itertools \
python310-numpy \
python310-setuptools \
python310-sympy \
python310-toml \
python310-tqdm \
python310-unyt \
update-alternatives"

inherit rpm
