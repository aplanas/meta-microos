SUMMARY = "Documentation for texlive-rutitlepage"
DESCRIPTION = "This package includes the documentation for texlive-rutitlepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn62143"

RPM_NAME = "texlive-rutitlepage-doc-2023.201.3.0svn62143-53.1.noarch.rpm"
RPM_HASH = "54d5e341ca9eb13fa29d0c7c4ff9c2a10af59e401c618563270fc0d2d79816a6f53955d12be60f432ee35282d1060c6b4cc0367a222d0c8a4c4b2c64b0f7b7d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rutitlepage-doc"
RDEPENDS:${PN} += ""

inherit rpm
