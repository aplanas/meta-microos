SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-tools-3.11.4-1.2.aarch64.rpm"
RPM_HASH = "287be17bd95386ec51c9aa0138db541b482b651ec6f40bd4a245fef31bc0bd04c243219ce22a408382f9bc14fa9a0a6a52ba7f30935ceae5582b3eb20e6cca4c"

RPROVIDES:${PN} += "python3-2to3 \
python3-demo \
python3-tools \
python311-2to3 \
python311-demo \
python311-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311-base"

inherit rpm
