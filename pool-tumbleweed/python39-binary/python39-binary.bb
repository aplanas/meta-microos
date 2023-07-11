SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python39-binary-1.0.0-2.10.noarch.rpm"
RPM_HASH = "170a41e898785bdbea00486d0033bf001e579304f8346ecb7e2f08870506b488bead8f69b19d94368334d5105a354c470b754890bf288f878070dc78b9e60640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-binary \
python39-binary \
python3dist-binary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
