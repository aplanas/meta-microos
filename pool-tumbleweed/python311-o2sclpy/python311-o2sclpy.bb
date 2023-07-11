SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python311-o2sclpy-0.926-1.6.noarch.rpm"
RPM_HASH = "63d54490acaf525dbfe531b0a2e4023a15e1e261ee2fa8ade1b7f08517676b34ec667e535c26830b4f601b9206e93d747b2f63f9a9c5dc57682b1c9505faf6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-o2sclpy \
python3.11dist-o2sclpy \
python311-o2sclpy \
python3dist-o2sclpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
o2scl-devel \
python-abi \
python311-h5py \
python311-matplotlib \
python311-numpy \
python311-requests \
texlive-latex \
update-alternatives"

inherit rpm
