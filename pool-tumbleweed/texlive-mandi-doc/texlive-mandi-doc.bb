SUMMARY = "Documentation for texlive-mandi"
DESCRIPTION = "This package includes the documentation for texlive-mandi"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.0svn61764"

RPM_NAME = "texlive-mandi-doc-2023.201.3.1.0svn61764-52.1.noarch.rpm"
RPM_HASH = "5296db55a03685f419e354fe9b0f4aeddee612450678f9ed16357a0cd4d668a0f7a656c38d6f0214474edd7ce2947adbf88ff3f2bd712ac3d2dce279430e43b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mandi-doc"

RDEPENDS:${PN} += ""

inherit rpm
