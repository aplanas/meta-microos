SUMMARY = "Documentation for texlive-tpslifonts"
DESCRIPTION = "This package includes the documentation for texlive-tpslifonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn42428"

RPM_NAME = "texlive-tpslifonts-doc-2023.209.0.0.6svn42428-53.1.noarch.rpm"
RPM_HASH = "0c188bef31a7c3b35433c6585849cca5070faab2c549ffc8ff28cfc2891f30f6e3d1fbf9f2d3753129aecb6cda89e4e008146120c53658c531319f97db9417a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tpslifonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
