SUMMARY = "Documentation for texlive-chembst"
DESCRIPTION = "This package includes the documentation for texlive-chembst"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.5svn15878"

RPM_NAME = "texlive-chembst-doc-2023.201.0.0.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "81d40e3bcaa54f7f3756b6386fcef02bd475ace1c787a2472439d909d98f15545af9c177a62c7fedd1a7a52e5960d2d929857fdc3e9d78826ee1de16cabdbf42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst-doc"

RDEPENDS:${PN} += ""

inherit rpm
