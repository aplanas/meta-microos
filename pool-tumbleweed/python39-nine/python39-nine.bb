SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python39-nine-1.1.0-1.15.noarch.rpm"
RPM_HASH = "013282805758a5a12b7c387cd5b6396fe14b4d4e67cdd123f23c6bca78581adf0a60f527c7a0b6b7f563c0d2ea117f5a27edce62b62c4fda3eb0f68a0febc9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nine \
python39-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
