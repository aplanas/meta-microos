SUMMARY = "Documentation for texlive-svgcolor"
DESCRIPTION = "This package includes the documentation for texlive-svgcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-svgcolor-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "cca550e34da4125a9e3cc53164ec2d5c4c3e564c4ef35d2ce0ce5dcd88cf2974c32f6835eed6756b7208a7a694bb1208f08eb4522c3600bee4d55b8cfac6dc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svgcolor-doc"
RDEPENDS:${PN} += ""

inherit rpm
