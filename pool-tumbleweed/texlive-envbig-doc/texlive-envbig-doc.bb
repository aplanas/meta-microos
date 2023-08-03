SUMMARY = "Documentation for texlive-envbig"
DESCRIPTION = "This package includes the documentation for texlive-envbig"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-envbig-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e8f2b0b75ab628f34f2e61fde190c1384cc38d23b3dda8e33519c2a9e5772f329ce14735d458fec5d7735a87afe541f16cc00639ff05da0d441a1b6f3968f9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envbig-doc"

RDEPENDS:${PN} += ""

inherit rpm
