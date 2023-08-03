SUMMARY = "Documentation for texlive-pst-hsb"
DESCRIPTION = "This package includes the documentation for texlive-pst-hsb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn61322"

RPM_NAME = "texlive-pst-hsb-doc-2023.209.0.0.02svn61322-53.1.noarch.rpm"
RPM_HASH = "dc0830fa29a0e6869d674c6d7a12ec84698b320e7c04583ae86221e7c99759e782dd9ad3cc3d2b3f076ba68ca8e06859b273c280ad6ecb6175b9c3e5faf0db76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-hsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
