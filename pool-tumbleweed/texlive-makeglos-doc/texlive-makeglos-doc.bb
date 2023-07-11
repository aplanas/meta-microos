SUMMARY = "Documentation for texlive-makeglos"
DESCRIPTION = "This package includes the documentation for texlive-makeglos"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makeglos-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "e00ce15075c1bf447370f8e2804e7dfd0fd12c5b12aade0556c672ef9d36854f3e9db282f08e1ed925f71381532afcc2cd35e4b82044e61a6c6b596d852835f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeglos-doc"

RDEPENDS:${PN} += ""

inherit rpm
