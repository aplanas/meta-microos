SUMMARY = "Documentation for texlive-schemata"
DESCRIPTION = "This package includes the documentation for texlive-schemata"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn58020"

RPM_NAME = "texlive-schemata-doc-2023.209.1.4svn58020-54.1.noarch.rpm"
RPM_HASH = "fbc41e18c37106b7a9af25e918e68fc07692372b6129286cb07720771c79e3abc616c697f3c1f53ce4d75e5d2ebe2d34abd06d4c804959ccf68bf8d0840eceef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schemata-doc"

RDEPENDS:${PN} += ""

inherit rpm
