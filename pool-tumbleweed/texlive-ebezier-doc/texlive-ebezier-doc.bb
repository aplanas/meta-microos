SUMMARY = "Documentation for texlive-ebezier"
DESCRIPTION = "This package includes the documentation for texlive-ebezier"
LICENSE = "LPPL-1.0"

PV = "2023.209.4svn15878"

RPM_NAME = "texlive-ebezier-doc-2023.209.4svn15878-54.1.noarch.rpm"
RPM_HASH = "e4b7c2bacea070c14b4feac07599b7c0f5cf8947045c81f591325c379a166f3300949ebd3eb57d9e50545dba67adc6f0e3afb41981e843b751061e21a065a7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
