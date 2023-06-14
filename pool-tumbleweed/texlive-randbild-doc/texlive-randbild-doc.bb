SUMMARY = "Documentation for texlive-randbild"
DESCRIPTION = "This package includes the documentation for texlive-randbild"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-randbild-doc-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "35cc046f4a7014a1530f7c080a3119b08a4150966c1a59fc7d4e3532c9fa52c5d7845555d59b7edf5f60dcf88ab3519d667478bfd2eebe512acd29f9ff7308f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-randbild-doc-de \
texlive-randbild-doc"

RDEPENDS:${PN} += ""

inherit rpm
