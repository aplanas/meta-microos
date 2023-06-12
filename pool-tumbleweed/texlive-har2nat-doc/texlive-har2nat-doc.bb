SUMMARY = "Documentation for texlive-har2nat"
DESCRIPTION = "This package includes the documentation for texlive-har2nat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-har2nat-doc-2023.201.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "30226663e3b2099f7b5dc8cdb43f75fa7f144ff9f880c5139a9d44e94d182c4318163e2ae724a404c03eabf907072d054773b79c29878d373a226af50c4a4a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-har2nat-doc"
RDEPENDS:${PN} += ""

inherit rpm
