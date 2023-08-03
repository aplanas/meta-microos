SUMMARY = "Documentation for texlive-diagmac2"
DESCRIPTION = "This package includes the documentation for texlive-diagmac2"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-diagmac2-doc-2023.209.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "09520fc2fffb9ac75570a4f0ba8cc2ba4610c91c0cd0788c7eb536278e5e42f27c68b4136f8e481a3e832008346d0f25490cb0c9a9708c2309ea9fda9f99083e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagmac2-doc"

RDEPENDS:${PN} += ""

inherit rpm
