SUMMARY = "Documentation for texlive-xltabular"
DESCRIPTION = "This package includes the documentation for texlive-xltabular"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-doc-2023.201.0.0.2esvn56855-52.2.noarch.rpm"
RPM_HASH = "2f51b4f9c59456180e72f9378e4d3f62e23b9a4c4df322c71a29ddbafc244d4edc96de4e63d222f7b1ab096c876437546a29ecb324541c993ad091027477ec37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
