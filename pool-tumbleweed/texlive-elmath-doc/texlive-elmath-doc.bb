SUMMARY = "Documentation for texlive-elmath"
DESCRIPTION = "This package includes the documentation for texlive-elmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-elmath-doc-2023.201.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "2764171b338ccc26447a09f6e60eae364cc49a62deb5ee665f423230d9b9ac8f3ac7f01f92061e3052b8c2b02f1c577f6bdebfec510308cb4b530bf450b4d8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
