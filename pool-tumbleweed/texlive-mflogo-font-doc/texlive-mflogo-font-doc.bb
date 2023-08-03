SUMMARY = "Documentation for texlive-mflogo-font"
DESCRIPTION = "This package includes the documentation for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2023.209.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-doc-2023.209.1.002svn54512-55.1.noarch.rpm"
RPM_HASH = "55835906691ae020e0c9739346331ec2821fc4922742f7be539453952e6605f24104159077c5d09c4750087f68d60e750eab138c7a38914a7b698c9896ad5cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
