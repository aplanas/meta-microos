SUMMARY = "Documentation for texlive-arphic"
DESCRIPTION = "This package includes the documentation for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-arphic-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "45637db2b32064df64c8deef8b87488d3634fb284c42355f4705fdc036a01d223b5beaabd7083ae7f145fe98e172cfe36ede26e36cb9be7729e5c0b6e25dcccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
