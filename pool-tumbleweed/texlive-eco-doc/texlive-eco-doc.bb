SUMMARY = "Documentation for texlive-eco"
DESCRIPTION = "This package includes the documentation for texlive-eco"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn29349"

RPM_NAME = "texlive-eco-doc-2023.201.1.3svn29349-53.2.noarch.rpm"
RPM_HASH = "ee85e9773ae2012c40f3ebc9452bee1252baa58ba4849480680da1326ab0b9fa18b02ab588c9a49297460e6fd690ab2207861810f5b900d44ce3798acaf38892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eco-doc"

RDEPENDS:${PN} += ""

inherit rpm
