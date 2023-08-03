SUMMARY = "Documentation for texlive-elzcards"
DESCRIPTION = "This package includes the documentation for texlive-elzcards"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.60svn51894"

RPM_NAME = "texlive-elzcards-doc-2023.209.1.60svn51894-54.1.noarch.rpm"
RPM_HASH = "df5bee5e996400415b58829095d749b186a42063f5fddd22b43c65748fce4fee84c65199cfbc908583a53899c763232003a99ef876a66d1035a7b4bbe2749e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elzcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
