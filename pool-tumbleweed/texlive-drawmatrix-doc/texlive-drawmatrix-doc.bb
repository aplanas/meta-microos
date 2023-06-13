SUMMARY = "Documentation for texlive-drawmatrix"
DESCRIPTION = "This package includes the documentation for texlive-drawmatrix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-doc-2023.201.1.5.0svn44471-52.1.noarch.rpm"
RPM_HASH = "8885d510df9089a2d5187873ff9451f237f8c0b97fd632e5bc256488f7fbba9d755330f4837d624c1c48ed2720c86d8ffe48abeb2a7c4aab86228557be801a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawmatrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
