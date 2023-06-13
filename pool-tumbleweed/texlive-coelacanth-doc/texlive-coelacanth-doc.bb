SUMMARY = "Documentation for texlive-coelacanth"
DESCRIPTION = "This package includes the documentation for texlive-coelacanth"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.005svn64558"

RPM_NAME = "texlive-coelacanth-doc-2023.201.0.0.005svn64558-53.1.noarch.rpm"
RPM_HASH = "8bfce8a66f529f62a5daa4d67d50a687e96db220d46ad9975b2642571702c01c934618733ec3f3f17fe2e72302c999561d79ffd8971c7e58a82dd9a30801ad66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coelacanth-doc"

RDEPENDS:${PN} += ""

inherit rpm
