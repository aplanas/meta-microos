SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python39-ase-3.22.1-2.4.noarch.rpm"
RPM_HASH = "69ddc3dc04d869a5c9e78151a4dc2a42e90e5ff73a2b27156e5b6243519fe0ebf3d1e23145ab52d482f30f8e52f5f85cd987cf9974d0948d97610e10f2f95b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ase \
python39-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
