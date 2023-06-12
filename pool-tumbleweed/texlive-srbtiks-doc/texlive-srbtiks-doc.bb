SUMMARY = "Documentation for texlive-srbtiks"
DESCRIPTION = "This package includes the documentation for texlive-srbtiks"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn63308"

RPM_NAME = "texlive-srbtiks-doc-2023.201.1.0svn63308-57.1.noarch.rpm"
RPM_HASH = "58e19fc4e36449cd47a8d6a162f86774cdf058256205e83f3ca7e0666ecf4747158a56ca0e2a506eb959dcf55de0d8045b444168af0f228004a1bc86b38505f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbtiks-doc"
RDEPENDS:${PN} += ""

inherit rpm
