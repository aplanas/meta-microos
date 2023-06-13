SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python39-genfire-1.1.11-5.4.noarch.rpm"
RPM_HASH = "364f952c7e1d07556b9a167aeda50cf3591e991c071a67e9c56f3fc9e237b2aeb99e03c854f686546d568e913da98ab486253850147c37ec571a1c0d3954a855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(genfire) \
python39-genfire \
python3dist(genfire)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Pillow \
python39-PyQt5 \
python39-numpy \
python39-pyFFTW \
python39-pyparsing \
python39-scipy \
python39-setuptools \
update-alternatives"

inherit rpm
