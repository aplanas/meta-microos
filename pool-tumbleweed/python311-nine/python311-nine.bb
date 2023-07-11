SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python311-nine-1.1.0-1.15.noarch.rpm"
RPM_HASH = "3aa0810ce037556ff0cf024236f8c50d7a1d84a64702170492c12db4c4cfa50bc3399cb40ffd839703d9ec87a1d5ed15b4220d27a28339ab534b0fcb7fc0f03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nine \
python3.11dist-nine \
python311-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
