SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-tools-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "b893ec0f6fac39f21ef9fd21f5c081a75808e13b7ae92539ef16b5b5f74b8ae7a3af2a547c279cc9661d603f1e5c46bffcf71e01bfa32e91ddc37cea7a8952f8"

RPROVIDES:${PN} += "python39-2to3 \
python39-demo \
python39-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39-base"

inherit rpm
