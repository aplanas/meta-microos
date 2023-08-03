SUMMARY = "Documentation for texlive-eskd"
DESCRIPTION = "This package includes the documentation for texlive-eskd"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eskd-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "7a79531f259d87993a0ea5891286ed2d922b217fb13194d112412313e21a9df5736f1b0e59aa728ae6969205259f888d3987f83c78ed22b5ddb863f245ddf721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eskd-doc"

RDEPENDS:${PN} += ""

inherit rpm
