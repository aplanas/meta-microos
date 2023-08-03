SUMMARY = "Documentation for texlive-powerdot-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-doc-2023.209.0.0.02asvn52922-53.1.noarch.rpm"
RPM_HASH = "d885469ed268f61d525d2d95406ed92d32210cd0bd76dc65db56233740648dae081485c2eb43fd13cc9133da3dd19b884c466372ee3437845f812d1dd6f8037d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
