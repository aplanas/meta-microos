SUMMARY = "Documentation for texlive-xecyrmongolian"
DESCRIPTION = "This package includes the documentation for texlive-xecyrmongolian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-doc-2023.209.1.0svn53160-53.2.noarch.rpm"
RPM_HASH = "6ddff5e220dd32154d2b0566040375ec2104c1016fe82170d984bccee6528a0b39e770cccb4d76397b2a85c30b5d1e4b576ae7536aacfcbecfb811c6da2c8ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecyrmongolian-doc"

RDEPENDS:${PN} += ""

inherit rpm
