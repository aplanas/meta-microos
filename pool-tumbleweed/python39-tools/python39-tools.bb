SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tools-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "05897218f4a4678cdf398c09c9f5d85b88d809458d7b2c45a8d400588d739c1f56e8dffb0f07531dbde0e3aece1c3ddaa830b6defa11359ce448db9368d48584"

RPROVIDES:${PN} += "python39-2to3 \
python39-demo \
python39-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39-base"

inherit rpm
