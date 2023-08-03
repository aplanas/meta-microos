SUMMARY = "Documentation for texlive-dox"
DESCRIPTION = "This package includes the documentation for texlive-dox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn46011"

RPM_NAME = "texlive-dox-doc-2023.209.2.4svn46011-53.1.noarch.rpm"
RPM_HASH = "1412d3d45f3be9dd1ced8ebd930b920534e341bb92dce0a815413edba1e6b88ca02b57e0bd467925037223aeef28a13c5069512541645c15020cfe2988715a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dox-doc"

RDEPENDS:${PN} += ""

inherit rpm
