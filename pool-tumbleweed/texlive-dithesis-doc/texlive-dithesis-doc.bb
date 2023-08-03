SUMMARY = "Documentation for texlive-dithesis"
DESCRIPTION = "This package includes the documentation for texlive-dithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-doc-2023.209.0.0.2svn34295-53.1.noarch.rpm"
RPM_HASH = "e4f981780c8227b059590c6d3e9137e1ec26fcc63016003ff7dbde1d36b7479b2bbbd2d694309ab14bb59a3615280d03fa0e770edcde1cb702f89a8015ffb8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
