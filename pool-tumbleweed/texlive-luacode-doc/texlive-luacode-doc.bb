SUMMARY = "Documentation for texlive-luacode"
DESCRIPTION = "This package includes the documentation for texlive-luacode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn25193"

RPM_NAME = "texlive-luacode-doc-2023.201.1.2asvn25193-52.1.noarch.rpm"
RPM_HASH = "01ec7242f702ecf9b6d8b83b3b1671ed83befc8ea8328561833b8e1e8df50f0a611b3cd470dc1b075df68d8e27c323db20dad7ab910652ed761731f278a3b25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacode-doc"
RDEPENDS:${PN} += ""

inherit rpm
