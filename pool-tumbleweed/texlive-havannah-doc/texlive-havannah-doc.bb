SUMMARY = "Documentation for texlive-havannah"
DESCRIPTION = "This package includes the documentation for texlive-havannah"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36348"

RPM_NAME = "texlive-havannah-doc-2023.209.svn36348-54.2.noarch.rpm"
RPM_HASH = "8034251c0496d8b3a6dd538fe0637804ea6f5f7db9803a2e3f2e9aeaae594e30702d796755bf5174f0f7309fdb81bb126a628b7a4801d6de73253fb3fd260c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-havannah-doc"

RDEPENDS:${PN} += ""

inherit rpm
