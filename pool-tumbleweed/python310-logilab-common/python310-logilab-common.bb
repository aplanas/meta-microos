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

RPM_NAME = "python310-logilab-common-1.9.8-1.3.noarch.rpm"
RPM_HASH = "644f47d5b21ae86fa52f3a50b887f51f3b4866bf5944baed5af79c44255deb283fc1a8d811e081783162c430dabbce21d9366f9f3998ab17ebee1e6c0f2dbb57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logilab-common \
python3.10dist(logilab-common) \
python310-logilab-common \
python3dist(logilab-common)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
