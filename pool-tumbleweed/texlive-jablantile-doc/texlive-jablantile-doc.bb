SUMMARY = "Documentation for texlive-jablantile"
DESCRIPTION = "This package includes the documentation for texlive-jablantile"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16364"

RPM_NAME = "texlive-jablantile-doc-2023.201.svn16364-55.1.noarch.rpm"
RPM_HASH = "28ad0d71d4f371120a1b4eea509b0fa4c400702911b95a0010a160d46147dfe206c37a223d654245ed7097072a00ed9375c56571861fdfb4516e770ad1ce66ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile-doc"

RDEPENDS:${PN} += ""

inherit rpm
