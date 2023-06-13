SUMMARY = "Documentation for texlive-schedule"
DESCRIPTION = "This package includes the documentation for texlive-schedule"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn51805"

RPM_NAME = "texlive-schedule-doc-2023.201.1.20svn51805-53.1.noarch.rpm"
RPM_HASH = "29903315c2cc41ed6ce64f59aa267699783e43ef45ef15347a506fb19275a91a08197b2838eee97ac003480287fd48b0c6773e19aa5d1e82f41e266d875f99cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schedule-doc"

RDEPENDS:${PN} += ""

inherit rpm
