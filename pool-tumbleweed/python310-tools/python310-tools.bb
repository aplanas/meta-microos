SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-tools-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "90b500505dc4ab51746d4f47658262c99ca3f148cb3c65bd433594e059ab5fb3ada070a645b116eb602972c896245eb3afb29b2ba269611533e5ae34e5b513ca"

RPROVIDES:${PN} += "python310-2to3 \
python310-demo \
python310-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310-base"

inherit rpm
