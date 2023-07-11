SUMMARY = "Documentation for texlive-emoji"
DESCRIPTION = "This package includes the documentation for texlive-emoji"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-doc-2023.201.0.0.2.2svn59961-53.2.noarch.rpm"
RPM_HASH = "e54cf36a89ee16162e33d9f24cc384680e7c2044838158302e223111d233d03bbe358f38e17170930c017c85a11a479df6ba583e06d868946f299cf544711d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
