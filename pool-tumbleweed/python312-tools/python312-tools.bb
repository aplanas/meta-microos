SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-tools-3.12.0b1-1.2.aarch64.rpm"
RPM_HASH = "718906668a8f29c97f418694a6fd640202f6cb35c5a4b081b94c782d62c08fb6bf3e2509027c78ee80c7c066cbe5ed8ef50742df40a4c9998c4b56079714a06b"

RPROVIDES:${PN} += "python312-2to3 \
python312-demo \
python312-tools"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312-base"

inherit rpm
