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

RPM_NAME = "python310-logilab-common-1.9.8-1.4.noarch.rpm"
RPM_HASH = "30620ab62126d5b76f5c0ca2403abac1a27e76b28785d84329a6f1e2ad493bf26dcd1de11ce2997b39a87998fa71a6c759fc9a5ff10425449a8978a16a572266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-logilab-common \
python310-logilab-common \
python3dist-logilab-common"

RDEPENDS:${PN} += "python-abi"

inherit rpm
