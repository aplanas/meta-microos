SUMMARY = "Documentation for texlive-jpneduenumerate"
DESCRIPTION = "This package includes the documentation for texlive-jpneduenumerate"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn63893"

RPM_NAME = "texlive-jpneduenumerate-doc-2023.209.1.2svn63893-56.1.noarch.rpm"
RPM_HASH = "4b876e0c2d1eb4f9efc1cb148148645653926f2c51967a9d2022426504945fcf7dbe39ffec0d15f231fa3ac60d7831342023cbda0524f848171f14ae9fea4b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpneduenumerate-doc-en \
texlive-jpneduenumerate-doc"

RDEPENDS:${PN} += ""

inherit rpm
