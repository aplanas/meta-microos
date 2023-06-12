SUMMARY = "Documentation for texlive-metago"
DESCRIPTION = "This package includes the documentation for texlive-metago"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn15878"

RPM_NAME = "texlive-metago-doc-2023.201.0.0.9svn15878-54.1.noarch.rpm"
RPM_HASH = "4ba174ba6812e1f6b9389686922c105912b6309d12997b6ecdd67e4e745d1661575dac8b28f966b3520d5c9e2a0f73308c4e2ce086ea7fa5a6db660182c46cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago-doc"
RDEPENDS:${PN} += ""

inherit rpm
