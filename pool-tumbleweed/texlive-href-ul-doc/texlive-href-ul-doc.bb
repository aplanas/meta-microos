SUMMARY = "Documentation for texlive-href-ul"
DESCRIPTION = "This package includes the documentation for texlive-href-ul"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-doc-2023.201.0.0.3.0svn64880-53.1.noarch.rpm"
RPM_HASH = "2923ccc0d756b26d40fa68715a4cab4bd97bb19dfac47e7fd488da513eb3f72747a53fbe09d8a815e17bd50fb7178e56ecc2ecda0456488a33e18d4283ff96d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-href-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
