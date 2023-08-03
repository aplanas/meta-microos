SUMMARY = "Documentation for texlive-fontmfizz"
DESCRIPTION = "This package includes the documentation for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43546"

RPM_NAME = "texlive-fontmfizz-doc-2023.209.svn43546-53.1.noarch.rpm"
RPM_HASH = "3a6ab565d62fa990cabbc5ec55395e66909dad0bd569cfa9e7d92bfe9169d01edd150ba6916670d5196320feec7b5b136cd9ca2ccfb1a32299995b758f972f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontmfizz-doc"

RDEPENDS:${PN} += ""

inherit rpm
