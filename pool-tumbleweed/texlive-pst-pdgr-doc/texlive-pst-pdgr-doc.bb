SUMMARY = "Documentation for texlive-pst-pdgr"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdgr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-doc-2023.209.0.0.4svn45875-54.1.noarch.rpm"
RPM_HASH = "3fe10d07dfd9391c328dedbd61b4e98290ccafb3d761e19f36508b55640f450fe274ca578b7e83c8c650c23b6060a0713ecfdd62801b0b8055351e85d7429976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pdgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
