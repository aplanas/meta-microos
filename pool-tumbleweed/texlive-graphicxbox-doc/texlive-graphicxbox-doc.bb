SUMMARY = "Documentation for texlive-graphicxbox"
DESCRIPTION = "This package includes the documentation for texlive-graphicxbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-doc-2023.201.1.0svn32630-53.1.noarch.rpm"
RPM_HASH = "c9a378f88b194a8befa0da3928ac457a6610d725fbdf1e6aa0c31779053fe1ea705a583ba66aa90067a4af7c05a6f87b845de17ef68d2d8bca64b09881a6f49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
