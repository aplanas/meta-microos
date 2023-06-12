SUMMARY = "Documentation for texlive-glossaries-french"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-doc-2023.201.1.1svn42873-53.1.noarch.rpm"
RPM_HASH = "4d2256d8963ff8ecb0dd0561f657d3fb0ccf09f1091b3bc82d3407f3d3b2c1d066dda51338576d6c3ec688180c7ba70bbac5b4deb7381b9b9891e1d3e9e2f75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-french-doc"
RDEPENDS:${PN} += ""

inherit rpm
