SUMMARY = "Documentation for texlive-footbib"
DESCRIPTION = "This package includes the documentation for texlive-footbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn17115"

RPM_NAME = "texlive-footbib-doc-2023.209.2.0.7svn17115-53.1.noarch.rpm"
RPM_HASH = "26527b62e0aad37018f1d0b509a8d771a488f7d2cd3fb1093ccd16a1e65138a657bb27e9cba4804749c6d4229ca9a27c956858afc91253a89155dc5025f8b7c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
