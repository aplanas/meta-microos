SUMMARY = "Documentation for texlive-rutitlepage"
DESCRIPTION = "This package includes the documentation for texlive-rutitlepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn62143"

RPM_NAME = "texlive-rutitlepage-doc-2023.209.3.0svn62143-54.1.noarch.rpm"
RPM_HASH = "f0c3f21273570459ec0b6b65d3422009de5e96f7db39d67bcfbb5d68be910d6962c0b522459dc106f43c214e64e73ec15f6476a2de9ac426720f74aa3fb9f506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rutitlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
