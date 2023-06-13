SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python311-cPyparsing-2.4.7.1.2.1-1.1.aarch64.rpm"
RPM_HASH = "ea7bf9d1072daf3263328f557a7697c0f4e4c3192f0430a2c61a05e4720fe7aeb5db1e98b55a0b5260a0e0ff03c2d5ea5ea2fd496df31db6eb63ed1a3acd1bc9"

RPROVIDES:${PN} += "python3.11dist(cpyparsing) \
python311-cPyparsing \
python311-cPyparsing(aarch-64) \
python3dist(cpyparsing)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
