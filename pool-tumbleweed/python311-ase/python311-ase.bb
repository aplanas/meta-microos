SUMMARY = "Atomic Simulation Environment"
DESCRIPTION = "Atomic Simulation Environment"
LICENSE = "LGPL-2.1-or-later"

PV = "3.22.1"

RPM_NAME = "python311-ase-3.22.1-2.2.noarch.rpm"
RPM_HASH = "ab9dc95a6af3fb9bf67040cf25acb87e080479916a9c91a16c9e859e1de0c355617e1614bd7e2a5ab653eb7900c8edef9d201d6c5cb4d23e4ab3a2b3eabdfbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ase \
python311-ase \
python3dist-ase"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
