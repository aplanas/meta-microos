SUMMARY = "Documentation for texlive-nndraw"
DESCRIPTION = "This package includes the documentation for texlive-nndraw"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59674"

RPM_NAME = "texlive-nndraw-doc-2023.209.1.0svn59674-55.1.noarch.rpm"
RPM_HASH = "63177446e2dce4ec24ea1c947f02cf4649340ff1732590440290b0febfdb81276ef75688611080fa91eed2aee1dd3baafbe942985835782b338efb45ab4baea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nndraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
