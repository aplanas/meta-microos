SUMMARY = "Documentation for texlive-graphicscache"
DESCRIPTION = "This package includes the documentation for texlive-graphicscache"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-doc-2023.209.0.0.4svn65318-54.1.noarch.rpm"
RPM_HASH = "6af033a6d7c1e9bcb6516f4d36698e26b4645aafdd2a19fd9d8a831987bff4e0793735e5532844e9c7d817f87668ccb1592012bd60269fb92c6033ce9a1f9392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicscache-doc"

RDEPENDS:${PN} += ""

inherit rpm
