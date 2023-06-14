SUMMARY = "Documentation for texlive-pagegrid"
DESCRIPTION = "This package includes the documentation for texlive-pagegrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn64470"

RPM_NAME = "texlive-pagegrid-doc-2023.201.1.6svn64470-51.1.noarch.rpm"
RPM_HASH = "f15dfe83460604d2d5e96bb7be429dc32d26309eb9e6c6239bfbc399e8d2ec59cf7e6f4986dc98a365ceb385faf96f7d31646474b4a2173015b51f216815e89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pagegrid-doc-en \
texlive-pagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
