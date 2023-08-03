SUMMARY = "Documentation for texlive-dtk"
DESCRIPTION = "This package includes the documentation for texlive-dtk"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.08nsvn65315"

RPM_NAME = "texlive-dtk-doc-2023.209.2.08nsvn65315-53.1.noarch.rpm"
RPM_HASH = "aebd3c0d4291b37b3943daf1786a9fa54313feb87d377474072e922ea65cb9be80063e8eac5ce1c4ec1702df728241dc319f54e0a392a811d844cdb810bc02d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dtk-doc-de \
texlive-dtk-doc"

RDEPENDS:${PN} += ""

inherit rpm
