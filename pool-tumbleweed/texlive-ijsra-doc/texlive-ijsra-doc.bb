SUMMARY = "Documentation for texlive-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-ijsra"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn44886"

RPM_NAME = "texlive-ijsra-doc-2023.208.1.1svn44886-53.1.noarch.rpm"
RPM_HASH = "8f090c827e2183d089c5bb8007c72185cc9e5ac2f85dda64d2509386697a57572d3ac6306cd483fb704ca7b7e45a6cd7d067bccc0bf9d2507b48bafcd1b3155a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
