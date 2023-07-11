SUMMARY = "Documentation for texlive-havannah"
DESCRIPTION = "This package includes the documentation for texlive-havannah"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36348"

RPM_NAME = "texlive-havannah-doc-2023.201.svn36348-53.2.noarch.rpm"
RPM_HASH = "d0448363c670647cde0f4c9cd231efbce754a08a54b5923f926856a85d19aacdc93c912863dc2d7dd0a8d051edd8f9b8705d6456b8b9aa59586ffb57d9822a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-havannah-doc"

RDEPENDS:${PN} += ""

inherit rpm
