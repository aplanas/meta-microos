SUMMARY = "Documentation for texlive-rcsinfo"
DESCRIPTION = "This package includes the documentation for texlive-rcsinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-doc-2023.209.1.11svn15878-54.1.noarch.rpm"
RPM_HASH = "0200f065fa613b40155a07995b86886f95096a0b8ecb4a8fa9da88cc2d0627d196761cc2fbae6149936bd4e3c4e3c1639105a4c1a5cd01c6fdde58b65052c902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcsinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
