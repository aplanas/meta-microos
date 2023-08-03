SUMMARY = "Documentation for texlive-versions"
DESCRIPTION = "This package includes the documentation for texlive-versions"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.55svn21921"

RPM_NAME = "texlive-versions-doc-2023.209.0.0.55svn21921-54.1.noarch.rpm"
RPM_HASH = "3a470e011fdcbcb83985d2270b3c89b56fde929440649c5031ee233d8d3ccb8f1a8ba22d2eb369e0345c9e67cb111a8682e35604058ef6ff839890039755184f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versions-doc"

RDEPENDS:${PN} += ""

inherit rpm
