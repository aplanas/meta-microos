SUMMARY = "Documentation for texlive-antiqua"
DESCRIPTION = "This package includes the documentation for texlive-antiqua"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.001.003svn24266"

RPM_NAME = "texlive-antiqua-doc-2023.201.001.003svn24266-54.1.noarch.rpm"
RPM_HASH = "6576013aceae2ff9fb9b377fe16676f9df468c4e0d2eae68a1475ab3f4c54300d72d1c3ba94f68d1ba8e919aeff088f5395cc5077c776aefc21f8b8576cab594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antiqua-doc"

RDEPENDS:${PN} += ""

inherit rpm
