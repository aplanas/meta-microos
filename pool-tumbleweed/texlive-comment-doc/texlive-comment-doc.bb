SUMMARY = "Documentation for texlive-comment"
DESCRIPTION = "This package includes the documentation for texlive-comment"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8svn41927"

RPM_NAME = "texlive-comment-doc-2023.209.3.8svn41927-54.1.noarch.rpm"
RPM_HASH = "19a953100fac6708e4b893588ad1ac6c28dd12a45e00235abae2c0a3fb9a0a0a29d83b10908ee98186ec051fb9c140d4d6d9e4522a10ebfbe094c46554351679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comment-doc"

RDEPENDS:${PN} += ""

inherit rpm
