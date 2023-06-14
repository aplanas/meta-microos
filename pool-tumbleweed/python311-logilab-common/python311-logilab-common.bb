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

RPM_NAME = "python311-logilab-common-1.9.8-1.3.noarch.rpm"
RPM_HASH = "aece47051435c8565b838d4c3c41020db02d0cb0bc90acba85252835aee943428fbd27f9549fdfd969695611bb47e6af9b145d739263b2862e28945f111e167b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-logilab-common \
python311-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi"

inherit rpm
