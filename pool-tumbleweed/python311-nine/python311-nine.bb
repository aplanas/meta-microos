SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python311-nine-1.1.0-1.13.noarch.rpm"
RPM_HASH = "5315c9862073d62e26e3f540870974e9d935aa1932c65b4597bab45d1dc41b3dc668d8fa7281f3ae77a83d0552d8b5ea317974949cd3dfc3c2f4d9f68fa27aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nine \
python311-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
