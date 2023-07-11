SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python311-zope.copy-4.3-2.2.noarch.rpm"
RPM_HASH = "1267660b513da5d6a264bb43758ec497426df11f5df4dbaa6f3999fa037428000b845a2ff899017f1bdd1a6945f1422f44ecedd779031ab05943110a37a132d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.copy \
python3.11dist-zope.copy \
python311-zope.copy \
python3dist-zope.copy"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface"

inherit rpm
