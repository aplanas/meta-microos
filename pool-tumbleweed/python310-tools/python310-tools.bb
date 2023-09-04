SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-tools-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "272111d8ce82174149d1032fb160cc2c32a2397da1c14732f9a303ca5f0023c5c2ffe2f204efc13a8548f4d63d0ca6872a8a9897a3c8a0c7dd35cb75914f61cc"

RPROVIDES:${PN} += "python310-2to3 \
python310-demo \
python310-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310-base"

inherit rpm
