SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python39-o2sclpy-0.926-1.6.noarch.rpm"
RPM_HASH = "107de6fd051a7ac871f619c6e032fcf814885ef091a26ee3b4f677ec74b8d99fd413e9abdee37c4d2fae83d0aa4ed20e2b1724c08b319d8dc329b748d3c1248e"
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
