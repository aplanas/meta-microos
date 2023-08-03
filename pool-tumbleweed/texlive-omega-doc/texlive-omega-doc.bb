SUMMARY = "Documentation for texlive-omega"
DESCRIPTION = "This package includes the documentation for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn33046"

RPM_NAME = "texlive-omega-doc-2023.209.svn33046-55.1.noarch.rpm"
RPM_HASH = "baa103cdb69faae0c9ab4d603d19917910dc31ee38124a260c3a05f8fb3d9a64f7b2085930a5d240d14f3292db154b2d3cd48ad91fead73df356b493cf2421a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-omega-doc"

RDEPENDS:${PN} += ""

inherit rpm
