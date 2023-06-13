SUMMARY = "Documentation for texlive-dhua"
DESCRIPTION = "This package includes the documentation for texlive-dhua"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn24035"

RPM_NAME = "texlive-dhua-doc-2023.201.0.0.11svn24035-52.1.noarch.rpm"
RPM_HASH = "0e6a8259df20980398a2ca382819a9e73754ee9ecf8e1a17900594753733e95f5eca230f25a01d3b8ff28b4c594ea47e20c184b6a1c37a53c21b16c961068487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dhua-doc"

RDEPENDS:${PN} += ""

inherit rpm
