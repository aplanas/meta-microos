SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python310-ase-3.22.1-2.2.noarch.rpm"
RPM_HASH = "edc6e7f9a2de32e69c25d555e6f829e8380fb07843c12c6f0eaea713381204b9bf3c2e857355f14bc9917d66e2da8c4474f003d040e0a66cb7e048843811e02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ase \
python3.10dist-ase \
python310-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
