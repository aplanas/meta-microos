SUMMARY = "Documentation for texlive-cleveref"
DESCRIPTION = "This package includes the documentation for texlive-cleveref"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21.4svn61719"

RPM_NAME = "texlive-cleveref-doc-2023.201.0.0.21.4svn61719-53.1.noarch.rpm"
RPM_HASH = "f641daf724400fecfb741505d22761984504c13882ac0967917b5da2e1143c6fde4164a3c380fe9b6bf51b4d4f450774784280f0ee08b5b707106ada4c3e70ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleveref-doc"

RDEPENDS:${PN} += ""

inherit rpm
