SUMMARY = "Documentation for texlive-pst-platon"
DESCRIPTION = "This package includes the documentation for texlive-pst-platon"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-doc-2023.201.0.0.01svn16538-53.1.noarch.rpm"
RPM_HASH = "e33d1c68198d3ae576ecfd7976b39812da9e2fe9058b44da7edf8ceeb10cfeb64de6fcbeaea62d777e69083cdf3ee2f4a5de1591a8de92243385d7b548a6e01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-platon-doc"

RDEPENDS:${PN} += ""

inherit rpm
