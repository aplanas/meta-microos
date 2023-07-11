SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python39-genfire-1.1.11-5.6.noarch.rpm"
RPM_HASH = "8d607ad6a3b6ca62b0f772e1e2a1396c20c48384f67f3d8a6fee70fec62e65204b56a8c9b7f93de22d742c40c93d3354613623009585e44453a823fc0ec17b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-genfire \
python39-genfire \
python3dist-genfire"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-PyQt5 \
python39-numpy \
python39-pyFFTW \
python39-pyparsing \
python39-scipy \
python39-setuptools \
update-alternatives"

inherit rpm
