SUMMARY = "Documentation for texlive-commutative-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-commutative-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn55526"

RPM_NAME = "texlive-commutative-diagrams-doc-2023.209.1.0.1svn55526-54.1.noarch.rpm"
RPM_HASH = "f7f33d10d23d7ba07693a0b3099a346a89d64170251aa800d218e412f9e3844a2b67ec9e633027cc89074e995a207cb8ac716df77d31c5174bc77cee382d497b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commutative-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
