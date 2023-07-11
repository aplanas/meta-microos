SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "This package contains documentation files for python-ZODB."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python-ZODB-doc-5.8.0-1.6.noarch.rpm"
RPM_HASH = "30605cd661925961c64acb5fa7fe6112ffe62738698ec387ba22772c41726e2e6b85257f91a06ed88e3387075b49d98d5090a6968fdede4a82bc8bec5bd31f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ZODB-doc \
python310-ZODB-doc \
python311-ZODB-doc \
python39-ZODB-doc"

RDEPENDS:${PN} += ""

inherit rpm
