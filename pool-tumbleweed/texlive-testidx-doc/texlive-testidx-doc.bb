SUMMARY = "Documentation for texlive-testidx"
DESCRIPTION = "This package includes the documentation for texlive-testidx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60966"

RPM_NAME = "texlive-testidx-doc-2023.209.1.2svn60966-55.1.noarch.rpm"
RPM_HASH = "09d6b989a59ca9d85540ce5958a269f8539a44248bc6fa7258436335c54f50495f4eff59cf3e1d649f3dd773433f974924953de59cafdc781adc9f1eb0974418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
