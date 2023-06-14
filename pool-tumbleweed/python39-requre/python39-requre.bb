SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-requre-0.8.2-1.5.noarch.rpm"
RPM_HASH = "02fbf84e2992eabd5d817b3387c77ed93025c8491867c5aca89cdb1ba6c1d08ef9c900a4b07aada52bc166a6687e7667b6e8c16026a3b0965d8a3af71ee27056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requre \
python39-requre \
python3dist-requre"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-GitPython \
python39-PyYAML \
python39-click \
python39-requests"

inherit rpm
