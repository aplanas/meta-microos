SUMMARY = "Documentation for texlive-dottex"
DESCRIPTION = "This package includes the documentation for texlive-dottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-dottex-doc-2023.209.0.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "e6f32a351d3c2ab7755a0c1fb05c4eaac3705fc3f6da815cb431e3017d679aea1ccfcb7695183a4622ed1d3c2b1e524d218a7f737a62832271acd152be89deed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
