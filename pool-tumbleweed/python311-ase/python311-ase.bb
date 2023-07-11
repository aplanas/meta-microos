SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python311-ase-3.22.1-2.4.noarch.rpm"
RPM_HASH = "7bc3783e1ebe31772a34f4860d8a340fed1be0bdc4afc4dd58bdb5f95958bbc18cf75e7c08b19a41eda584573b615be21c655fa6f1208ba894b0084738b56ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ase \
python3.11dist-ase \
python311-ase \
python3dist-ase"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
