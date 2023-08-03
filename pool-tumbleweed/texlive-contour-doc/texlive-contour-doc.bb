SUMMARY = "Documentation for texlive-contour"
DESCRIPTION = "This package includes the documentation for texlive-contour"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn18950"

RPM_NAME = "texlive-contour-doc-2023.209.2.14svn18950-55.1.noarch.rpm"
RPM_HASH = "1c385ae792ebf578a443672e02b807519019c03dc12fc753abc01d730f81f6f6a50a75fb3b0304a674bdfe6773b25612245244a7d03f42c3bc086eb9f25cff5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contour-doc"

RDEPENDS:${PN} += ""

inherit rpm
