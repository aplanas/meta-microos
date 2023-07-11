SUMMARY = "Documentation for texlive-refenums"
DESCRIPTION = "This package includes the documentation for texlive-refenums"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn44131"

RPM_NAME = "texlive-refenums-doc-2023.201.1.1.2svn44131-53.2.noarch.rpm"
RPM_HASH = "a6cd14dd3fb16323c66943b6de6b3de8d9e35883cb0015749332c192b4ee9c0061efed8e87803f942ef062a517c96f7cadd9f908ee2d749c1ac32a3c30936f3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refenums-doc"

RDEPENDS:${PN} += ""

inherit rpm
