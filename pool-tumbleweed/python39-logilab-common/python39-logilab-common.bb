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

RPM_NAME = "python39-logilab-common-1.9.8-1.3.noarch.rpm"
RPM_HASH = "4fc488bb3d4d2c5368b67d7a0520b955afee11b5656b2a3f94b98188d1f4618bd998c7af56945c16fdf063ecdb2605150ccac6a6f54f199aa7708cb99d88f7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(logilab-common) \
python39-logilab-common \
python3dist(logilab-common)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
