SUMMARY = "Documentation for texlive-hershey-mp"
DESCRIPTION = "This package includes the documentation for texlive-hershey-mp"
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-doc-2023.201.2022_1.0svn64878-53.2.noarch.rpm"
RPM_HASH = "299706306622fab56f450363859946450650a2c4b24a213a22d8aaadf591e503fd7a294c4db0d3b60b37f4cc4137808a5c51a265696345fbd636752abe55c11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
