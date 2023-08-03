SUMMARY = "Documentation for texlive-coelacanth"
DESCRIPTION = "This package includes the documentation for texlive-coelacanth"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.005svn64558"

RPM_NAME = "texlive-coelacanth-doc-2023.209.0.0.005svn64558-54.1.noarch.rpm"
RPM_HASH = "58fe6aa9b14ef0aa3a518f9a7607171783c9bd52d9e64eda910be7c6c68e6fee38cd3629eff8666ecd2b70904f55724cd55637d8fc2c6f36fe2082eaddb3aa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coelacanth-doc"

RDEPENDS:${PN} += ""

inherit rpm
