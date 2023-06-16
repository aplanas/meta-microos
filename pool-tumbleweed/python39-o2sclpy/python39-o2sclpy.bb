SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python39-o2sclpy-0.926-1.4.noarch.rpm"
RPM_HASH = "6225601b989858cfebc034c7b6e5bed39b740928dd34a9e07cc5f37890168c08693d935f35324e32bde30c491855e489909f3b1254d64a58adb48a95b457af5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-o2sclpy \
python39-o2sclpy \
python3dist-o2sclpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
o2scl-devel \
python-abi \
python39-h5py \
python39-matplotlib \
python39-numpy \
python39-requests \
texlive-latex \
update-alternatives"

inherit rpm
