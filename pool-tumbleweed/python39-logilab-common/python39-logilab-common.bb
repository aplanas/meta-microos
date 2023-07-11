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

RPM_NAME = "python39-logilab-common-1.9.8-1.4.noarch.rpm"
RPM_HASH = "7b4041ac6661131c8cd0b637e6c96e8fb2dd75359497ae6de6e28462a727fc7bcd8aaf3afdfa3798fdc5d1b9918e2ed0b0b79c16c329c3af73ca3d7ea5f27534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-logilab-common \
python39-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi"

inherit rpm
