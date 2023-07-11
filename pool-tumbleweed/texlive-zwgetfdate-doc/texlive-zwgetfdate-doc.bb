SUMMARY = "Documentation for texlive-zwgetfdate"
DESCRIPTION = "This package includes the documentation for texlive-zwgetfdate"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-zwgetfdate-doc-2023.201.svn15878-52.2.noarch.rpm"
RPM_HASH = "80c9c0d8e61c3ed15d39dc8fa4297e78492c03263a7d656a7d95ad4b1efb897a469cc49e976501aac72aaee9de2bf2abde3ef9705417b1fe2fa92a2e9a51344c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwgetfdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
