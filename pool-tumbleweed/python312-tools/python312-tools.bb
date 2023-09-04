SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-tools-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "82d9f51f36e5206ac0fa7b35011c12c6e19c20df35af531481a9786d15efeaed60af79c2b9b02b022453ea9ba2b893c4b1dbe001ff99faa6cba7a3f7eefe84c1"

RPROVIDES:${PN} += "python312-2to3 \
python312-demo \
python312-tools"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312-base"

inherit rpm
