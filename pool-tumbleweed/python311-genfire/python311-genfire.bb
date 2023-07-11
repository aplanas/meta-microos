SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python311-genfire-1.1.11-5.6.noarch.rpm"
RPM_HASH = "76797828933ab8008775396bea0f3f896f607af00cbe86187b9545fc19072e80301b36e81f661ff83dac26c558ddce5567228c26f45f5580898660eeb43f74cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genfire \
python3.11dist-genfire \
python311-genfire \
python3dist-genfire"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-PyQt5 \
python311-numpy \
python311-pyFFTW \
python311-pyparsing \
python311-scipy \
python311-setuptools \
update-alternatives"

inherit rpm
