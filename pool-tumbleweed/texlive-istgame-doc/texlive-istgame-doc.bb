SUMMARY = "Documentation for texlive-istgame"
DESCRIPTION = "This package includes the documentation for texlive-istgame"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn62946"

RPM_NAME = "texlive-istgame-doc-2023.209.2.1svn62946-56.1.noarch.rpm"
RPM_HASH = "887b33d83a4518214d88715ab21bb536c06d2220686e3896fcd10cbdb073a2a879eff7d16a1e5e5577919a3c2729d446483817c77755ba115ba8320ea1e5bcfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-istgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
