SUMMARY = "Documentation for texlive-selinput"
DESCRIPTION = "This package includes the documentation for texlive-selinput"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53098"

RPM_NAME = "texlive-selinput-doc-2023.201.1.6svn53098-53.1.noarch.rpm"
RPM_HASH = "517df5318477f56cc610a46e0e1be666dedfe587ae59fd44e79117decd33b7e124781637b6d1e4462b10c99ee8d6c5baeb077da1e93113bae43f079a52cf68a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selinput-doc"

RDEPENDS:${PN} += ""

inherit rpm
