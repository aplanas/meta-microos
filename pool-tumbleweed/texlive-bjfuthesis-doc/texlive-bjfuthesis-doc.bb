SUMMARY = "Documentation for texlive-bjfuthesis"
DESCRIPTION = "This package includes the documentation for texlive-bjfuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2.1svn59809"

RPM_NAME = "texlive-bjfuthesis-doc-2023.209.1.2.1svn59809-53.1.noarch.rpm"
RPM_HASH = "0c2307a2656ea9a8b383e4da52f6543892b4712afcbc5d240478afaa727f7665bcba237add0a23fa0769f956fac81a3b93834eca81489996ab069de5bb20378f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-bjfuthesis-doc-zh \
texlive-bjfuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
