SUMMARY = "Documentation for texlive-tabu"
DESCRIPTION = "This package includes the documentation for texlive-tabu"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn61719"

RPM_NAME = "texlive-tabu-doc-2023.201.2.9svn61719-54.1.noarch.rpm"
RPM_HASH = "2c48d9863ea834f7f9f300020481fb76e04ea34457932eb9174f04f40a372ca173b5547cc8f4074f15d3190b15e4ad365f95ecec281e6478624e11cd7c46b83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabu-doc"

RDEPENDS:${PN} += ""

inherit rpm
