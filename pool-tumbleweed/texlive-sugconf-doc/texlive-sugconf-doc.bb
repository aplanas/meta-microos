SUMMARY = "Documentation for texlive-sugconf"
DESCRIPTION = "This package includes the documentation for texlive-sugconf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58752"

RPM_NAME = "texlive-sugconf-doc-2023.209.svn58752-58.1.noarch.rpm"
RPM_HASH = "e7bef007d0204e443310a7673fe04212224f7b95bcfea185da34a6da201a856b2cf20c070f781696520a4ce08f9f6a4c4b66cf0acc8d8c6a1fc82d71fb5dbf23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sugconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
