SUMMARY = "Documentation for texlive-makeindex"
DESCRIPTION = "This package includes the documentation for texlive-makeindex"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn62517"

RPM_NAME = "texlive-makeindex-doc-2023.208.svn62517-53.1.noarch.rpm"
RPM_HASH = "72f82395f794c668e3a5b94beec150df3d5060918b2692da515f9fa90ad646a13ee04fdaf813b07277ad8b85c5b571aa80ed6c2d72123a49e41a3f3bc89c7541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeindex.1 \
man-mkindex.1 \
texlive-makeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
