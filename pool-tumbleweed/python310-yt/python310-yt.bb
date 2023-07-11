SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "python310-yt-4.1.4-1.6.aarch64.rpm"
RPM_HASH = "ee2a38c34f3a6fdb0738fac8bf1a5d6fc3f64bf623ffbd4fc7a3939d98322a2febcda799a534b5b2ee3069b24c86edbd9e4b4c12d14954794146e3bfa44c4cea"

RPROVIDES:${PN} += "python3.10dist-yt \
python310-yt \
python3dist-yt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
