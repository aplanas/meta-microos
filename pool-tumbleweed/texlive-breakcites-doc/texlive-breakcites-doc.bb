SUMMARY = "Documentation for texlive-breakcites"
DESCRIPTION = "This package includes the documentation for texlive-breakcites"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21014"

RPM_NAME = "texlive-breakcites-doc-2023.201.svn21014-52.1.noarch.rpm"
RPM_HASH = "769ee572460529b96ce346da80be95b569c058db713f0cb52016413a0be0507b8ca7c07fbc4ef4f5d90d3609f04b92d71e2ce884182666d1eb0cd1789e4702ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakcites-doc"

RDEPENDS:${PN} += ""

inherit rpm
