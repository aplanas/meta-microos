SUMMARY = "Documentation for texlive-orientation"
DESCRIPTION = "This package includes the documentation for texlive-orientation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57390"

RPM_NAME = "texlive-orientation-doc-2023.209.1.0svn57390-55.1.noarch.rpm"
RPM_HASH = "67ba0b7419154448a01a3133479312f06c4264defa67b576c9bbea971fac40de68f3146059068551bfe932fe0aee5014845b77c40e0354d5015651a07a3cd5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orientation-doc"

RDEPENDS:${PN} += ""

inherit rpm
