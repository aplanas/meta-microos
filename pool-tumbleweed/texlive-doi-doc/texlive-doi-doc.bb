SUMMARY = "Documentation for texlive-doi"
DESCRIPTION = "This package includes the documentation for texlive-doi"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48634"

RPM_NAME = "texlive-doi-doc-2023.209.svn48634-53.1.noarch.rpm"
RPM_HASH = "bd31e568ab6268b9221441ebea409189286861923b7a9c6668521fd5dec30232703fb43b35d99a959e55e72999936ff360848e9e63704f19754df486e83c0b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doi-doc"

RDEPENDS:${PN} += ""

inherit rpm
