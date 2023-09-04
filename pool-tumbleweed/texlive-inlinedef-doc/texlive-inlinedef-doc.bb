SUMMARY = "Documentation for texlive-inlinedef"
DESCRIPTION = "This package includes the documentation for texlive-inlinedef"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-inlinedef-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "efea6b787a7ae0c06424807fd02b51eb985b4eef8dcfe5e1f11aa70be357dee256214a7e7c4b2662b24180e3b1d115d3a386c3fa5a801f152bc6acdbeac2cd3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
