SUMMARY = "Documentation for texlive-iso"
DESCRIPTION = "This package includes the documentation for texlive-iso"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn15878"

RPM_NAME = "texlive-iso-doc-2023.201.2.4svn15878-55.1.noarch.rpm"
RPM_HASH = "5657ce6298b0cb65fb7ad20bf8818098ba62df6082e9bea9d933cc59bf4544bcf1d57557a59319f45178e698979e9be0e0ba93eaa6da3f4d049ebb07f34d47fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso-doc"

RDEPENDS:${PN} += ""

inherit rpm
