SUMMARY = "Development files for python311-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python311-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python311-pyzmq-devel-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "ff4afdde9e1f2e659a03a53ca221fa866d6f355cb37e4d6c4fc48c7e34e90c336b8b865fd9b2a14b876f13b1c77dada60c64af9042581618a1eb37af453ff083"

RPROVIDES:${PN} += "python3-pyzmq-devel \
python311-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python311-devel \
python311-pyzmq \
zeromq-devel"

inherit rpm
