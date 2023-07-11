SUMMARY = "An analysis and visualization toolkit for volumetric data"
DESCRIPTION = "YT is an python package for analyzing and visualizing volumetric \
data.  YT supports structured, variable-resolution meshes, \
unstructured meshes, and discrete or sampled data such as particles."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "python39-yt-4.1.4-1.6.aarch64.rpm"
RPM_HASH = "7bbb6a253dce0a165e29aa2358e215ae9258dcea37f20e59b590a944d0996ac4f71ce5f477c2ce0a973b961db6027ad00972e75894890b7badc9fcff40b741a8"

RPROVIDES:${PN} += "python3.9dist-yt \
python39-yt \
python3dist-yt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-ipython \
python39-matplotlib \
python39-more-itertools \
python39-numpy \
python39-setuptools \
python39-sympy \
python39-toml \
python39-tqdm \
python39-unyt \
update-alternatives"

inherit rpm
