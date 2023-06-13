SUMMARY = "Documentation for texlive-scale"
DESCRIPTION = "This package includes the documentation for texlive-scale"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.2svn15878"

RPM_NAME = "texlive-scale-doc-2023.201.1.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "3eddd281ffb447d3f126e33bad8c6a8892e1699ef9fd71ee5e75ea85817770b5c1dad103373844633df3fb8e4b6bccfd3fa4a980377640a3eea6e8c5edb1133f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scale-doc"

RDEPENDS:${PN} += ""

inherit rpm
