SUMMARY = "Documentation for texlive-ttfutils"
DESCRIPTION = "This package includes the documentation for texlive-ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-ttfutils-doc-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "d2c38dcbf2bbaef229f6e2b0f869e8d5ae0bc672bc47fa451ec746696c6f98d6bc8a4fe14b8fcbcf18fe03a7b6be7fc954000b81adfdc6b4db215842d9f3515f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ttf2afm.1 \
man-ttf2pk.1 \
man-ttf2tfm.1 \
man-ttfdump.1 \
texlive-ttfutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
