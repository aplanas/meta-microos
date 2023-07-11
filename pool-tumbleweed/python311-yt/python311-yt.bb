SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "python311-yt-4.1.4-1.6.aarch64.rpm"
RPM_HASH = "78d2463142e479f75db4ce6676521c2c77e20db54dafb196bc7822bdf96c5616134a9cb419f2c5cd6592c5a6149fc833b0423b13852f94ee112256377b82566c"

RPROVIDES:${PN} += "python3-yt \
python3.11dist-yt \
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
