SUMMARY = "Documentation for texlive-xpinyin"
DESCRIPTION = "This package includes the documentation for texlive-xpinyin"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn66115"

RPM_NAME = "texlive-xpinyin-doc-2023.209.3.1svn66115-53.1.noarch.rpm"
RPM_HASH = "0d6ae6c098ff18b969de2bf6d8b3cbee660def07e1f87120f5a2d17ea5fe4c67c3fac4e98c5bdfaee4400445d923dc9c3df55382380b175d5c655ec79ca9127e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xpinyin-doc-zh \
texlive-xpinyin-doc"

RDEPENDS:${PN} += ""

inherit rpm
