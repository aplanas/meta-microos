SUMMARY = "Documentation for texlive-realhats"
DESCRIPTION = "This package includes the documentation for texlive-realhats"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63595"

RPM_NAME = "texlive-realhats-doc-2023.201.6.0svn63595-53.2.noarch.rpm"
RPM_HASH = "4bfd8563a9c3cc2351518fc905bc0e165f6f7404dd934ca28a6d25297c6c3e5af6a5ca94623b27c45e34ac9740d3feebb015122f1972ff01c9a4d9d0b6135e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realhats-doc"

RDEPENDS:${PN} += ""

inherit rpm
