SUMMARY = "Python lowlevel functionality shared by logilab projects"
DESCRIPTION = "The package logilab.common contains several modules providing low level \
functionalities shared among some python projects developed by logilab. \
 \
The package is used by pylint, an advanced Python style and syntax \
checker. \
 \
Please note that some of the modules have some extra dependencies. For \
instance, logilab.common.db will require a db-api 2.0 compliant \
database driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "python311-logilab-common-1.9.8-1.4.noarch.rpm"
RPM_HASH = "7ba768878064759a81d16c203496b8f70cdeac1ef4ba99593b49b4781ae8b2f598d31dbd15fd7326a3e314309ab9512a2602b2d95962edc79cf75841ec05b006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logilab-common \
python3.11dist-logilab-common \
python311-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi"

inherit rpm
