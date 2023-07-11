SUMMARY = "Documentation for texlive-xyling"
DESCRIPTION = "This package includes the documentation for texlive-xyling"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xyling-doc-2023.201.1.1svn15878-52.2.noarch.rpm"
RPM_HASH = "2549f7d2c223d04b2fb7951dc2d906fba8a160885fd4754371b908c7d5857890e93a1f42319a83b532ddd92b1cb69f78034b276f8e9a99112a4af8fea9124882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xyling-doc-en \
texlive-xyling-doc"

RDEPENDS:${PN} += ""

inherit rpm
