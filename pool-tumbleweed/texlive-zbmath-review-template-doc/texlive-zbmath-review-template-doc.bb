SUMMARY = "Documentation for texlive-zbmath-review-template"
DESCRIPTION = "This package includes the documentation for texlive-zbmath-review-template"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-doc-2023.201.2.1svn59693-52.2.noarch.rpm"
RPM_HASH = "ea70059fef266606f66886a8b49f7ec61124af4d922d467c9e736e78c273b8dc4884c7118473d4e34a10289bb6524311af9eaf6d43fcbba1eb69dc4e5402d454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zbmath-review-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
