SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python310-genfire-1.1.11-5.6.noarch.rpm"
RPM_HASH = "c437e6c1694afe0d88f1fd24d93e8239b6bab84ef4abd569b392aa54dd8c4a162f12ca52539accffa0e4ae1b2dab7aa81406e96a00c3daa56ddb267e67a0f653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-genfire \
python310-genfire \
python3dist-genfire"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-PyQt5 \
python310-numpy \
python310-pyFFTW \
python310-pyparsing \
python310-scipy \
python310-setuptools \
update-alternatives"

inherit rpm
