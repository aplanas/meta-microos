SUMMARY = "Documentation for texlive-germbib"
DESCRIPTION = "This package includes the documentation for texlive-germbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-germbib-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "97002c17b4002a1f2874f285a4902ae2874b0cace59fadcce0cd0c7e6bcfc86cb1be17bcbfa2841311c81601698ede171161f78b4b3295a7b246eb78b7b0c4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
