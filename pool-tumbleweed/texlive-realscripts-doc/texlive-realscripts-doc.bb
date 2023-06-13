SUMMARY = "Documentation for texlive-realscripts"
DESCRIPTION = "This package includes the documentation for texlive-realscripts"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-doc-2023.201.0.0.3dsvn56594-53.1.noarch.rpm"
RPM_HASH = "0f339eea9fc78d7cca5a21ac19249f44d1763bd1557ad7f28baa5a159706f1230243974d6f1cec39832fcc4939bbb68b994ad78830dc73bf6ca9cb7ce3d22642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
