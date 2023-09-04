SUMMARY = "Documentation for texlive-gradient-text"
DESCRIPTION = "This package includes the documentation for texlive-gradient-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65567"

RPM_NAME = "texlive-gradient-text-doc-2023.209.1.2svn65567-54.2.noarch.rpm"
RPM_HASH = "59642c583887174fa1a3f6e67c51559944a3bad4a6047e3c1bf0c8f7feff476347480a4ac7b74e0e38718b5e18e02d6ce34590e308e15606c7cb37367d860d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradient-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
