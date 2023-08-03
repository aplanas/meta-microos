SUMMARY = "Documentation for texlive-ucalgmthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucalgmthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52527"

RPM_NAME = "texlive-ucalgmthesis-doc-2023.209.svn52527-53.1.noarch.rpm"
RPM_HASH = "c242f1a697ffd611b4118fed34c0a02afc47ae31901307409f80ddf390574002d23fcd39877511dfe04650819a59f48305278d1622504c7f6fe13118e12cb64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucalgmthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
