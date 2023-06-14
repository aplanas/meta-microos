SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python310-o2sclpy-0.926-1.4.noarch.rpm"
RPM_HASH = "1af55b071e9cdc9b9cb4794a9d557d8e678086c2fbd778b0a4a02059fad543e490a0fc6f5725602eb1668aa994ce437d4d212e6eb8d9d839f0bfe3eb521cf066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-o2sclpy \
python3.10dist-o2sclpy \
python310-o2sclpy \
python3dist-o2sclpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
o2scl-devel \
python-abi \
python310-h5py \
python310-matplotlib \
python310-numpy \
python310-requests \
texlive-latex \
update-alternatives"

inherit rpm
