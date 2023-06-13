SUMMARY = "Documentation for texlive-hvindex"
DESCRIPTION = "This package includes the documentation for texlive-hvindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-doc-2023.201.0.0.04svn46051-52.1.noarch.rpm"
RPM_HASH = "e30d282855acd123ea343f1909ee8a0a189c1ee0c997076bd61ff0663899d84f044b668e3be713749bc677c2c45f98c36c61b3408b4f89d539030b8730be2d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
