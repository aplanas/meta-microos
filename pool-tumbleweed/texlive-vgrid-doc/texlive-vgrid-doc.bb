SUMMARY = "Documentation for texlive-vgrid"
DESCRIPTION = "This package includes the documentation for texlive-vgrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-doc-2023.209.0.0.1svn32457-54.1.noarch.rpm"
RPM_HASH = "6ef3984a4e649c8602531d36abc22ab559becb6b808aed782e14008d1a7927e4038a8082f76af287f842f284e81f3d5a19b2a39ce28183c681e1fc80d46ae614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vgrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
