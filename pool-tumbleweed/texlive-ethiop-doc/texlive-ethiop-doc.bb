SUMMARY = "Documentation for texlive-ethiop"
DESCRIPTION = "This package includes the documentation for texlive-ethiop"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn15878"

RPM_NAME = "texlive-ethiop-doc-2023.201.0.0.7svn15878-52.1.noarch.rpm"
RPM_HASH = "39234336f6c8d345ca841c33211356be2fabe8f7e694ebe02f3d93b11e7291d0583e34b380be6c5aff2443dd3770f9e3fbf88d6b11459f474885d53ef0c43f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-doc"

RDEPENDS:${PN} += ""

inherit rpm
