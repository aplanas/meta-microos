SUMMARY = "Documentation for texlive-hvindex"
DESCRIPTION = "This package includes the documentation for texlive-hvindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn46051"

RPM_NAME = "texlive-hvindex-doc-2023.209.0.0.04svn46051-54.1.noarch.rpm"
RPM_HASH = "a5e9460379fb519680fc6180c567aed8fa2f6b4f9a418a9b2009bc812843bf98ea0d2acd1e6bdd86a096708b1bcafc4bca83526cd14812f839aed28cb356cf2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
