SUMMARY = "Documentation for texlive-magicnum"
DESCRIPTION = "This package includes the documentation for texlive-magicnum"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn52983"

RPM_NAME = "texlive-magicnum-doc-2023.208.1.7svn52983-53.1.noarch.rpm"
RPM_HASH = "bf1d8aa88a4477d50b31f432cea7fe2177fb314879b99ab7ba6b04bd30434d4fdd6969bfee70fc4b7763ae02a8952c06336fde0d46c8144c8ad4efab6d5ea6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magicnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
