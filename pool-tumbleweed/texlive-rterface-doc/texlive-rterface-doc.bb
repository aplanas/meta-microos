SUMMARY = "Documentation for texlive-rterface"
DESCRIPTION = "This package includes the documentation for texlive-rterface"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn30084"

RPM_NAME = "texlive-rterface-doc-2023.201.svn30084-53.1.noarch.rpm"
RPM_HASH = "b3f0b83b5f7d7f5404285ef0d10b06da2ddcc34a3bc1e1a16419507dc659763af5a5f177f2c5536662d2f1082c6876b1c02353feb0f6d863d3b488f7114b482e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rterface-doc"

RDEPENDS:${PN} += ""

inherit rpm
