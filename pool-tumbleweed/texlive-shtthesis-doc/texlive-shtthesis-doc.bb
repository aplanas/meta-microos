SUMMARY = "Documentation for texlive-shtthesis"
DESCRIPTION = "This package includes the documentation for texlive-shtthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3.3svn62441"

RPM_NAME = "texlive-shtthesis-doc-2023.209.0.0.3.3svn62441-54.1.noarch.rpm"
RPM_HASH = "3190bfda0d21f062d2f27a8aa2f5da9a663e1d1bbb0cdb86dfe097c8b4971a545557cd85449404c369e4d9c541ac6a60ec046057db289beb8323c8e69dbb504a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shtthesis-doc-zh \
texlive-shtthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
