SUMMARY = "Documentation for texlive-thmbox"
DESCRIPTION = "This package includes the documentation for texlive-thmbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-thmbox-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "394d1eb98cd1c42549c712f56839880d83e0889d2433078bd54e14b72e588395b3a9f26c08826d051cbf49c6f89afb374e14957b5aa078b541fa31839eb2df85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
