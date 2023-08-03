SUMMARY = "Documentation for texlive-bxjscls"
DESCRIPTION = "This package includes the documentation for texlive-bxjscls"
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.7asvn63011"

RPM_NAME = "texlive-bxjscls-doc-2023.209.2.7asvn63011-53.1.noarch.rpm"
RPM_HASH = "7bd6928210e807132210011db27e1a366df84bedbe872f9a0afe8ea648b1abb3571375b13286b99a20e6b37bb7e3914e655deec3b78a22fec3e1767344c7d454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjscls-doc-ja \
texlive-bxjscls-doc"

RDEPENDS:${PN} += ""

inherit rpm
