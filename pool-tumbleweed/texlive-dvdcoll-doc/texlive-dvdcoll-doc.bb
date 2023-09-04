SUMMARY = "Documentation for texlive-dvdcoll"
DESCRIPTION = "This package includes the documentation for texlive-dvdcoll"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-doc-2023.209.1.1asvn15878-54.2.noarch.rpm"
RPM_HASH = "5944fd3ca256253266937e77b3bed0e86b4d51fc86e47f027cff697a51ede63ac12316bb33e1405cea884ce53955a8789e6193d4631f0b05d2f675b927e98446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dvdcoll-doc-en;de \
texlive-dvdcoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
