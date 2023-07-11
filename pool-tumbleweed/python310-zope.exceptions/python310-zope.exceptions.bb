SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.exceptions-4.6-2.2.noarch.rpm"
RPM_HASH = "1560bdf6d5ff9b0a4cc478ae94221390be1d532b95894c97157f1442fedd5b4bd43d22a806ff2f1f46ba438bd30dafd81e397a62b30c8aa12531f40f66e502f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.exceptions \
python310-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface"

inherit rpm
