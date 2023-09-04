SUMMARY = "Documentation for texlive-edmac"
DESCRIPTION = "This package includes the documentation for texlive-edmac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.17svn61719"

RPM_NAME = "texlive-edmac-doc-2023.209.3.17svn61719-54.2.noarch.rpm"
RPM_HASH = "e564eab314b21c1edde806e8438d128fb19143a6437f7949fd5b4ed3f325340ed5a9d542e55fa5d12dbebface025af374ae7fd3cb6a1ad59d7a531a641088cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
