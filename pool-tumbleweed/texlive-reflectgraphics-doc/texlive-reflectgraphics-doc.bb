SUMMARY = "Documentation for texlive-reflectgraphics"
DESCRIPTION = "This package includes the documentation for texlive-reflectgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-doc-2023.209.0.0.2csvn40612-54.2.noarch.rpm"
RPM_HASH = "234a281096e0c3068c0598d77c456e4df2581febd9702040bae4e41ac72325fa53f50f8a8e5f6bec79eac160cad100ba3bc32819a55e86fdb2b77e4af8e01bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reflectgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
