SUMMARY = "Documentation for texlive-pxfonts"
DESCRIPTION = "This package includes the documentation for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pxfonts-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "9ea9ca698c6f16225e6b7089825ce50a2db3a6030d758e4cd5b9859d844f30eb74247e3256eacc9cf8ecbffdeba96cf3027e503aa42f1f2324698f391d3813cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
