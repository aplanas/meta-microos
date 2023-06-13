SUMMARY = "Documentation for texlive-zwgetfdate"
DESCRIPTION = "This package includes the documentation for texlive-zwgetfdate"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-zwgetfdate-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d94e734b62511b377b39a7d3ee34b02e1052516bee29ea6cfff6267e0c0bfdae929b3ebebd197caac8a84558872ee594bda1724aea974f1dc45d62d1b6d18ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwgetfdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
