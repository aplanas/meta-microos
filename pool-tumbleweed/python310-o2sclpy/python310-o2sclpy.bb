SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python310-o2sclpy-0.926-1.6.noarch.rpm"
RPM_HASH = "4c5e2d1d8d42c7e39557504b5e4ea21c5eba9efd73bf11c33e65c2ec0f7a17f28f2a98f22dae687c211142971c5e99f8d3965d0ec779085cfa8004a6260a5e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-o2sclpy \
python310-o2sclpy \
python3dist-o2sclpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
o2scl-devel \
python-abi \
python310-h5py \
python310-matplotlib \
python310-numpy \
python310-requests \
texlive-latex \
update-alternatives"

inherit rpm
