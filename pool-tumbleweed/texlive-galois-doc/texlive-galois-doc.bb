SUMMARY = "Documentation for texlive-galois"
DESCRIPTION = "This package includes the documentation for texlive-galois"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-galois-doc-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "8a74ab01c747b5adac9f2bb70abaebb2b4d6d3240c593aa44d9a7112b88fde15cc2927fb3d241828a4ea4c35a938dc69bcd492913d61b416822dc809431cd583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-galois-doc"

RDEPENDS:${PN} += ""

inherit rpm
