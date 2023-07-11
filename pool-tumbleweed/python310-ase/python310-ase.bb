SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python310-ase-3.22.1-2.4.noarch.rpm"
RPM_HASH = "9dd12e17a9de4b984908ba668c779a6ad9dbdd77b880b814190c6bb1a09bd5e077ea84ed2ea190e8ab65cfa456146523591d0f267995e9dbbae2cb8bfd3efc86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ase \
python310-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
