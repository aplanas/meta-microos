SUMMARY = "Documentation for texlive-drv"
DESCRIPTION = "This package includes the documentation for texlive-drv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn29349"

RPM_NAME = "texlive-drv-doc-2023.209.0.0.97svn29349-53.1.noarch.rpm"
RPM_HASH = "2c5648319f452eb4b9668d2f5f3e8fbe9f2d47088c1565ac0de341331df63cc2557c883ec2d87c0deb263575daf8b3c5619c1b2c38e15292bdde8dc0376e59c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drv-doc"

RDEPENDS:${PN} += ""

inherit rpm
