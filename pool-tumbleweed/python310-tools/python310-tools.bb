SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tools-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "c14533778a709eda7756f99c55f67222cd51d12e44ca4c676d9631a37105b9eeb4c4bcb3a0f4d3378d0b024b7bba6878830fc51bcb41de412ecb3ef24694647e"

RPROVIDES:${PN} += "python310-2to3 \
python310-demo \
python310-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310-base"

inherit rpm
