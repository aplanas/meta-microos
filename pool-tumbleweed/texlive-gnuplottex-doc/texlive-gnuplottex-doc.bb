SUMMARY = "Documentation for texlive-gnuplottex"
DESCRIPTION = "This package includes the documentation for texlive-gnuplottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-doc-2023.201.0.0.9.5svn54758-53.2.noarch.rpm"
RPM_HASH = "d0727b9c19e37f1070f5a4d0b2b995c6ff7a25de861a562b05a9e0ccebcd62c31b71b9538f1e190b9e5d409c9816e53b5a86eb799d5809ae5cc24e376863b5e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnuplottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
