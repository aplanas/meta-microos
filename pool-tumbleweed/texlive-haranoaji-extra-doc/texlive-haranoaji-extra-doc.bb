SUMMARY = "Documentation for texlive-haranoaji-extra"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-doc-2023.201.20230223svn66115-53.2.noarch.rpm"
RPM_HASH = "f955cd29defc7a9ed37a97ea4a170d6c573143ab1b9548806cb46052978cd14ade73014d69a91851543b8742270e83337e3bf755ae02726a523f26c7a0389c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
