SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python310-nine-1.1.0-1.15.noarch.rpm"
RPM_HASH = "24c3ae3172940de85e3b9e08992c34e1305f1afc7b69f3504370ecc56c725757fa0b0fc85d10049e0305d72e3886bdab1452da75466a3616421584a83d416c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nine \
python310-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
