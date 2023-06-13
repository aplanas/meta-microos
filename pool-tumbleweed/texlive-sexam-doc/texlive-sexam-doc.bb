SUMMARY = "Documentation for texlive-sexam"
DESCRIPTION = "This package includes the documentation for texlive-sexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn46628"

RPM_NAME = "texlive-sexam-doc-2023.201.1svn46628-53.1.noarch.rpm"
RPM_HASH = "5220b0c5f9647bd076e5b77f290de4d0dabc2c6d60bfe2c7bbe882064e6b7e6585ba289939844c0103633de467c6a311eac092c50a7183105388cf141747799f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-sexam-doc:ar-dz) \
texlive-sexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
