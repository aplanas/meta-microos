SUMMARY = "Documentation for texlive-hereapplies"
DESCRIPTION = "This package includes the documentation for texlive-hereapplies"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-doc-2023.201.1.0.1svn65251-53.2.noarch.rpm"
RPM_HASH = "57456a86f75759ffd4b30d58118704a9fb25e7be0f30aecb1ce143d26236d3d6ed2742ebfbe0d992eb21688b8a34274cde060dcdab6e1b53a24adde1500fdf83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hereapplies-doc"

RDEPENDS:${PN} += ""

inherit rpm
