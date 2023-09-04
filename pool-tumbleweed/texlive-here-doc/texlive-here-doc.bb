SUMMARY = "Documentation for texlive-here"
DESCRIPTION = "This package includes the documentation for texlive-here"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16135"

RPM_NAME = "texlive-here-doc-2023.209.svn16135-54.2.noarch.rpm"
RPM_HASH = "d3f7204855a2ccb5c59c00aa364743fc34877b6e4cc60b5b7fb8a0744b2ec10ab75e1c026a504da4eaf991fa6dfe38b1d8baa9476706a89a230d06d512860c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-here-doc"

RDEPENDS:${PN} += ""

inherit rpm
