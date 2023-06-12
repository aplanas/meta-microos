SUMMARY = "Documentation for texlive-context-animation"
DESCRIPTION = "This package includes the documentation for texlive-context-animation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-animation-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "0acc7d3a41686bbc7f713d0cdab57712e72109d6033072184a372036a1766df2df15cc660f53f2dfb319eaf40816b3fdafb266a45ce03831fb55599df732648e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-animation-doc"
RDEPENDS:${PN} += ""

inherit rpm
