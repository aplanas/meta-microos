SUMMARY = "Documentation for texlive-bjfuthesis"
DESCRIPTION = "This package includes the documentation for texlive-bjfuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-doc-2023.201.1.2.1svn59809-52.1.noarch.rpm"
RPM_HASH = "51e29c89eac6f20394bc8d61fe61e622ea5a34c026c513ccac646d90af2447137c90f7060fc7a7af9607472fd34330c1a16ba259e5a40f153a751f17ad76dedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bjfuthesis-doc-zh \
texlive-bjfuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
