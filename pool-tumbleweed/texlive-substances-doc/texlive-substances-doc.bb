SUMMARY = "Documentation for texlive-substances"
DESCRIPTION = "This package includes the documentation for texlive-substances"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn40989"

RPM_NAME = "texlive-substances-doc-2023.201.0.0.2asvn40989-57.1.noarch.rpm"
RPM_HASH = "c8c0be65663585546f091cf3c997661feeb51bf4274f9e258775f4d40c6e221a2b6714410efc8c24063b468476e911648386fe693b2fd302f6263bfe6e31b0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substances-doc"

RDEPENDS:${PN} += ""

inherit rpm
