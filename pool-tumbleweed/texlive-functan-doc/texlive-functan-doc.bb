SUMMARY = "Documentation for texlive-functan"
DESCRIPTION = "This package includes the documentation for texlive-functan"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-functan-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "273529a3467d2c6a7cd7f76391741197ad973445ae59c765d16adcf11b29ece7376f3332cce299c6d2535926eb30e4eac7784917fa4fd5abe29b1e57d72bd3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functan-doc"
RDEPENDS:${PN} += ""

inherit rpm
